/*******************************************************************************
 * Copyright (c) 2017 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package wasdev.sample.rest;

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

import wasdev.sample.*;
import wasdev.sample.store.VisitorStore;
import wasdev.sample.store.VisitorStoreFactory;
import com.ibm.watson.developer_cloud.tone_analyzer.v3_beta.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3_beta.model.ToneAnalysis;
import com.ibm.watson.developer_cloud.tone_analyzer.v3_beta.model.ToneCategory;
import com.ibm.watson.developer_cloud.tone_analyzer.v3_beta.model.ToneScore;

@ApplicationPath("api")
@Path("/visitors")
public class VisitorAPI extends Application {

	//Our database store
	VisitorStore store = VisitorStoreFactory.getInstance();

	ToneAnalyzer service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_02_11);

  /**
   * Gets all Visitors.
   * REST API example:
   * <code>
   * GET http://localhost:9080/GetStartedJava/api/visitors
   * </code>
   *
   * Response:
   * <code>
   * [ "Bob", "Jane" ]
   * </code>
   * @return A collection of all the Visitors
   */
    @GET
    @Path("/")
    @Produces({"application/json"})
    public String getVisitors() {

		if (store == null) {
			return "[]";
		}

		List<String> names = new ArrayList<String>();
		for (Visitor doc : store.getAll()) {
			String name = doc.getName();
			if (name != null){
				names.add(name);
			}
		}
		return new Gson().toJson(names);
    }

    /**
     * Creates a new Visitor.
     *
     * REST API example:
     * <code>
     * POST http://localhost:9080/GetStartedJava/api/visitors
     * <code>
     * POST Body:
     * <code>
     * {
     *   "name":"Bob"
     * }
     * </code>
     * Response:
     * <code>
     * {
     *   "id":"123",
     *   "name":"Bob"
     * }
     * </code>
     * @param visitor The new Visitor to create.
     * @return The Visitor after it has been stored.  This will include a unique ID for the Visitor.
     */
    @POST
    @Produces("application/text")
    @Consumes("application/json")
    public String newToDo(Visitor visitor) {
      if(store == null) {
    	  return String.format("Hello %s!", (visitor.getName()+" "+visitor.getL_name()));
      }
      store.persist(visitor);
      return String.format("Hello %s! I've added you to the database.",(visitor.getName()+" "+visitor.getL_name()));

    }

		@POST
		@Path("/tone")
    @Produces("application/json")
    @Consumes("application/json")
		public ToneAnalysis getToneAnalysis(Sentence sentence){

			service.setEndPoint("https://gateway.watsonplatform.net/tone-analyzer/api");
			service.setUsernameAndPassword("acab34f4-88d3-4bf6-8cad-c9c216440cd2", "xN4GgyuPmoZO");
			// Call the service and get the tone
			ToneAnalysis tone = service.getTone(sentence.getStr()).execute();
			System.out.println(tone);
			return tone;

		}


}
