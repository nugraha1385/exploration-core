package com.indra.testCard.model;

import java.util.List;

/**
 * Created by Indrap on 8/26/2016.
 */
public class TestCard {

    public final static String TYPE_SINGLE_ANSWER = "SINGLE_ANSWER";
    public final static String TYPE_MULTI_ANSWER = "MULTI_ANSWER";

    private String testCardId;
    private String question;
    private List<TestOption> options;
    private List<TestAnswer> correctAnswer;
    private float result;
    private String type;

}
