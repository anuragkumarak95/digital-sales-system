package wasdev.biz.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import com.google.gson.Gson;

import wasdev.biz.conn.*;
import wasdev.biz.model.*;

@ApplicationPath("api")
@Path("/product")
public class ProductApi extends Application{
  MyCloudantClient<Product> conn = EntityFactory.getProductInstance();

  @POST
  @Path("/")
  @Produces("application/json")
  @Consumes("application/json")
  public String addProduct(Product p){
    if (conn == null) return "Connection not established.";

    return new Gson().toJson(conn.persist(p));

  }

  @GET
  @Path("/")
  @Produces("application/json")
  public String getAllProducts(){
    if (conn == null) return "Connection not established.";

    return new Gson().toJson(conn.getAll());
  }

  @GET
  @Path("/{_id}")
  @Produces("application/json")
  public String getProductby_id(@PathParam("_id") String _id){
    return new Gson().toJson(conn.get(_id));
  }

  @DELETE
  @Path("/{_id}")
  @Produces("application/json")
  public String deleteProductby_id(@PathParam("_id") String _id){
    conn.delete(_id);
    return "Product Removed.";
  }

  @PUT
  @Path("/{_id}")
  @Consumes("application/json")
  @Produces("application/json")
  public String updateProductbyId(@PathParam("_id") String _id,Product product){
    conn.update(_id,product);
    return "{\"status\":\"OK\",\"task\":\"PRODUCT UPDATE\"}";
  }
}
