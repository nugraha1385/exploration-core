package com.indra.testCard;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by Indrap on 8/26/2016.
 */
public class MainApp extends Application<MainConf>{

    //define application entry point
    public static void main(String[] args) throws  Exception{
        new MainApp().run(args);

    }

    @Override
    public void initialize(Bootstrap<MainConf> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public String getName() {
        return "test card apps";
    }

    @Override
    public void run(MainConf mainConf, Environment environment) throws Exception {
        System.out.println("Call run of mainApp");
        final MainResource mainResource = new MainResource();
        environment.jersey().register(mainResource);

    }
}
