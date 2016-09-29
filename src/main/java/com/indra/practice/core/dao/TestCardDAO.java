package com.indra.practice.core.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 * Created by Indrap on 9/1/2016.
 */
public interface TestCardDAO {


    @SqlUpdate( "insert into test_card (test_card_id,question,result) " +
            "values (:test_card_id, :question, :result )")
    void insert(@Bind("test_card_id") String test_card_id,
                @Bind("question") String question,
                @Bind("result") float result);



}
