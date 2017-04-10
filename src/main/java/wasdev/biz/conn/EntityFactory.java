package wasdev.biz.conn;

import wasdev.biz.model.*;

public class EntityFactory{
  private static final String TAG = "\\/EntityFactory/\\ -- ";

  private static MyCloudantClient<User> userInstance;
  private static MyCloudantClient<Product> productInstance;
  private static MyCloudantClient<Order> orderInstance;

	static {
		MyCloudantClient<User> uI = new MyCloudantClient<User>("userdb",User.class);
		if(uI.getDB() != null){
			userInstance = uI;
		}

    MyCloudantClient<Product> pI = new MyCloudantClient<Product>("productdb",Product.class);
    if(pI.getDB() != null){
			productInstance = pI;
		}

    MyCloudantClient<Order> oI = new MyCloudantClient<Order>("orderdb",Order.class);
    if(oI.getDB() != null){
			orderInstance = oI;
		}
	}

	public static MyCloudantClient<User> getUserInstance() {
    System.out.println(TAG+"User Cloudant DB Instance Requested.");
		return userInstance;
	}

  public static MyCloudantClient<Product> getProductInstance(){
    System.out.println(TAG+"Product Cloudant DB Instance Requested.");
    return productInstance;
  }

  public static MyCloudantClient<Order> getOrderInstance(){
    System.out.println(TAG+"Order Cloudant DB Instance Requested.");
    return orderInstance;
  }
}
