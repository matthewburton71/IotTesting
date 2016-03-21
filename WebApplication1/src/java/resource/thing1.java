/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author matthew
 */
@Path("thing")
public class thing1 {

    @Context
    private UriInfo context;
    
    Gson gson;
    WebThing thing;

    /**
     * Creates a new instance of thing1
     */
    public thing1() {
        System.out.println("resource.thing1.<init>()");
        thing = new WebThing();
        gson = new Gson();
    }

    /**
     * Retrieves representation of an instance of resource.thing1
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        System.out.println("resource.thing1.getJson()");
        return gson.toJson(thing);
    }
    
    /**
     * PUT method for updating or creating an instance of thing1
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        System.out.println("resource.thing1.putJson()");
        System.out.println("content: " + content);
    }
    
    /**
     * Retrieves representation of an instance of resource.thing1
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/model")
    @Produces(MediaType.APPLICATION_JSON)
    public String getModelJson() {
        //TODO return proper representation object
        System.out.println("resource.thing1.getModelJson()");
        return gson.toJson("Raspbery Pi 2");
    }
}
