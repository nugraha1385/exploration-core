package com.indra.practice;


import com.indra.practice.resource.TestResource;
import com.indra.practice.resource.TestCardResource;
import com.indra.practice.core.service.MainService;
import com.indra.practice.health.DatabaseHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

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
        return MainConstant.APP_NAME;
    }

    @Override
    public void run(MainConf mainConf, Environment environment) throws Exception {
        System.out.println("Call run of mainApp");

        //database stuff, JDBI ways
        final DBIFactory factory = new DBIFactory();
        final DBI dbi = factory.build(environment, mainConf.getDataSourceFactory(), "mariadb");
        //main service will contain all the DAO
        final MainService mainService = new MainService(dbi);

        //app api stuff
        final TestResource testResource = new TestResource();
        final TestCardResource testCardResource = new TestCardResource( mainService.getTestCardService() );
        environment.jersey().register(testResource);
        environment.jersey().register(testCardResource);

        //app health check stuff
        environment.healthChecks().register("database",new DatabaseHealthCheck());
    }
}
