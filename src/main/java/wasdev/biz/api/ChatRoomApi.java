package wasdev.biz.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import com.google.gson.Gson;

import wasdev.biz.chatroom.*;

@ApplicationPath("chat")
@Path("/manager")
public class ChatRoomApi extends Application{

  @POST
  @Path("/start")
  @Produces("application/text")
  public String startManager(){
    ChatManager.startManager(45);
    return "Chat Manager Started at port 45";
  }

  @POST
  @Path("/close")
  @Produces("application/text")
  public String closeManager(){
    ChatManager.stopManager();
    return "Current Chat Manager Server Socket Closed.";
  }


}
