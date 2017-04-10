package wasdev.biz.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import com.google.gson.Gson;

import wasdev.biz.conn.*;
import wasdev.biz.model.*;

@ApplicationPath("api")
@Path("/order")
public class OrderApi extends Application{
  MyCloudantClient<Order> conn = EntityFactory.getOrderInstance();

  @POST
  @Path("/")
  @Produces("application/json")
  @Consumes("application/json")
  public String addOrder(Order o){
    if (conn == null) return "Connection not established.";

    return new Gson().toJson(conn.persist(o));

  }

  @GET
  @Path("/")
  @Produces("application/json")
  public String getAllOrders(){
    if (conn == null) return "Connection not established.";

    return new Gson().toJson(conn.getAll());
  }

  @GET
  @Path("/{_id}")
  @Produces("application/json")
  public String getOrderby_id(@PathParam("_id") String _id){
    return new Gson().toJson(conn.get(_id));
  }

  @DELETE
  @Path("/{_id}")
  @Produces("application/json")
  public String deleteOrderby_id(@PathParam("_id") String _id){
    conn.delete(_id);
    return "Order Deleted.";

  }

  @PUT
  @Path("/{_id}")
  @Consumes("application/json")
  @Produces("application/json")
  public String updateOrderbyId(@PathParam("_id") String _id,Order order){
    conn.update(_id,order);
    return "{\"status\":\"OK\",\"task\":\"ORDER UPDATE\"}";
  }
}
