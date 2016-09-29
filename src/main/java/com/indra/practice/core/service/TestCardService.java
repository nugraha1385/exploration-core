package com.indra.practice.core.service;

import com.indra.practice.core.dao.TestCardDAO;
import org.skife.jdbi.v2.DBI;

/**
 * Created by Indrap on 9/1/2016.
 */
public class TestCardService {

    // contain test card, test option and test answer
    private TestCardDAO testCardDAO;

    public TestCardService(DBI dbi){
        this.testCardDAO = dbi.onDemand(TestCardDAO.class);;
    }

    public TestCardDAO getTestCardDAO() {
        return testCardDAO;
    }


    public String hello(){
        return "Hello TestCardService";
    }
}
