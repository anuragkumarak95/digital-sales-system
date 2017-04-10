package wasdev.biz.conn;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.google.gson.JsonObject;
import wasdev.biz.model.*;


public class MyCloudantClient<T extends CloudantEntity>{
  private static final String TAG = "\\/MyCloudantClient<T>/\\ -- ";
  private Database db = null;
  private final Class<T> template;
  private final String databaseName;

  public MyCloudantClient(String db_name,Class<T> template){
    databaseName = db_name;
    this.template = template;
    CloudantClient cloudant = createClient();
		if(cloudant!=null){
		 db = cloudant.database(databaseName, true);
		}
  }

  public Database getDB(){
		return db;
	}

  private static CloudantClient createClient() {

    String url;

    if (false) {//System.getenv("VCAP_SERVICES") != null
      // When running in Bluemix, the VCAP_SERVICES env var will have the credentials for all bound/connected services
      // Parse the VCAP JSON structure looking for cloudant.
      JsonObject cloudantCredentials = VCAPHelper.getCloudCredentials("cloudant");
      if(cloudantCredentials == null){
        System.out.println("No cloudant database service bound to this application");
        return null;
      }
      url = cloudantCredentials.get("url").getAsString();
    } else {
      System.out.println("Running locally. Looking for credentials in cloudant.properties");
      url = VCAPHelper.getLocalProperties("cloudant.properties").getProperty("cloudant_url");
      if(url == null || url.length()==0){
        System.out.println("To use a database, set the Cloudant url in src/main/resources/cloudant.properties");
        return null;
      }
    }

    try {
      System.out.println("Connecting to Cloudant");
      CloudantClient client = ClientBuilder.url(new URL(url)).build();
      return client;
    } catch (Exception e) {
      System.out.println("Unable to connect to database");
      //e.printStackTrace();
      return null;
    }
  }


	public Collection<T> getAll(){
        List<T> docs;
		try {
			docs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(template);
		} catch (IOException e) {
			return null;
		}
        return docs;
	}


	public T get(String id) {
		return db.find(template, id);
	}


	public T persist(T td) {
		String id = db.save(td).getId();
		return db.find(template, id);
	}

	public T update(String id, T newT) {
		T t = db.find(template, id);
		t.copy(newT);
		db.update(t);
		return db.find(template, id);
	}


	public void delete(String id) {
		T t = db.find(template, id);
		db.remove(id, t.get_rev());

	}


	public int count() throws Exception {
		return getAll().size();
	}


}
