package com.indra.practice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by Indrap on 8/26/2016.
 */

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    public TestResource(){
    }

    @GET
    public String sayHello(){
        return "Hello TestResource";
    }
}
