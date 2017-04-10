package wasdev.biz.model;


// Parent Entity : for all Cloudant Db Entities, ensuring few states and behaviours in all of them.
public abstract class CloudantEntity{
  protected String _id;
  protected String _rev;

  public abstract String get_id();
  public abstract void set_id(String _id);
  public abstract String get_rev();
  public abstract void set_rev(String _rev);


  //used for U in CRUD..
  public abstract void copy(CloudantEntity obj);
}
