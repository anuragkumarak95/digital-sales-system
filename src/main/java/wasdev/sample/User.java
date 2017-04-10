package wasdev.sample;

public class User{
  private String _id;
  private String _rev;
  private String uName=null;
  private String uPass=null;

  public User(){
    this.uName = "";
    this.uPass = "";
  }

  public String getUName(){
    return uName;
  }

  public void setUName(String uName){
    this.uName = uName;
  }

  public String getUPass(){
    return uPass;
  }

  public void setUPass(String uPass){
    this.uPass = uPass;
  }


}
