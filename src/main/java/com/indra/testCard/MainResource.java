package com.indra.testCard;

import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 * Created by Indrap on 8/26/2016.
 */

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class MainResource {

    public MainResource(){

    }

    @GET
    public String sayHello(@QueryParam("name") Optional<String> name){
        return "Hello " +name;
    }
}
