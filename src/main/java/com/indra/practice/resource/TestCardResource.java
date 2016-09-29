package com.indra.practice.resource;

import com.indra.practice.core.service.TestCardService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Indrap on 9/1/2016.
 */

@Path("/test_card_api")
@Produces(MediaType.APPLICATION_JSON)
public class TestCardResource {

    private TestCardService testCardService;

    public TestCardResource(TestCardService testCardService){
        this.testCardService = testCardService;
    }

    @GET
    public String sayHello(){
        return "Hello TestCardResource " + testCardService.hello();
    }

    //fake
    @GET
    @Path("/insert")
    public void insert(){
        testCardService.getTestCardDAO().insert("TEST01","Question",0);
        testCardService.getTestCardDAO().insert("TEST01","Question",0);
    }


}
