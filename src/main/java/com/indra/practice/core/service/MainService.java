package com.indra.practice.core.service;

import org.skife.jdbi.v2.DBI;

/**
 * Created by Indrap on 9/1/2016.
 * will coordinate access to most of DAO
 */
public class MainService {
    private DBI dbi;
    //one door policy
    private TestCardService testCardService;

    public MainService(DBI dbi){
        this.dbi = dbi;
        this.testCardService = new TestCardService(dbi);
    }

    public TestCardService getTestCardService() {
        return testCardService;
    }

    public void setTestCardService(TestCardService testCardService) {
        this.testCardService = testCardService;
    }





}
