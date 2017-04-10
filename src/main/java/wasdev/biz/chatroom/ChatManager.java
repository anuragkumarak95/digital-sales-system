package wasdev.biz.chatroom;


import java.util.*;
import java.io.*;
import java.net.*;

@SuppressWarnings("unchecked")
public class ChatManager{
  private static final String TAG = "\\/ChatManager/\\ -- ";
  private static ArrayList users = new ArrayList();
  private static ServerSocket serverSocket;
  private static Socket s;

  public static void startManager(int port){

    try{
      //close any previous leftover running sockets
      if(serverSocket != null) serverSocket.close();
      //instanciate new serverSocket
      serverSocket = new ServerSocket(port);
      System.out.println(TAG+"Chat Manager Server Socket opened.");
      while(true){
        s = serverSocket.accept();
        users.add(s);
        System.out.println("New User Entered >> "+s);

        Runnable r = new SocketRun(s,users);
        Thread t = new Thread(r);
        t.start();
      }

    }catch(Exception e){e.printStackTrace();}
  }

  public static void stopManager(){
    if(serverSocket != null){

      try{serverSocket.close();
          System.out.println(TAG+"Chat Manager Active Server Socket closed.");
      }catch(IOException ioe){ioe.printStackTrace();}
    }
    else System.out.println(TAG+"Server Socket already closed.");
  }

  public ChatManager(){
    //empty..
  }

}

class SocketRun implements Runnable{
  Socket s;
  ArrayList users;

  SocketRun(Socket s,ArrayList users){
    this.s = s;
    this.users = users;
  }

  public void run(){
    String s1;
    try{
      DataInputStream dn = new DataInputStream(s.getInputStream());

      do{
        s1 = dn.readUTF();
        if(!(s1.equals("stop")||s1.equals("exit"))) broadcast(s1,s);

        else{
          DataOutputStream ds = new DataOutputStream(s.getOutputStream());
          ds.writeUTF(s1);
          ds.flush();
        }

      }while(!( s1.equals("stop")||s1.equals("exit")));

    }catch(Exception e){e.printStackTrace();}

  }

  private void broadcast(String s1,Socket s){
    Iterator i = users.iterator();
    while(i.hasNext()){
      try{
      Socket sc = (Socket)i.next();
      DataOutputStream ds = new DataOutputStream(sc.getOutputStream());
      ds.writeUTF(s1);
      ds.flush();
      }catch(Exception e){e.printStackTrace();}
    }
  }
}
