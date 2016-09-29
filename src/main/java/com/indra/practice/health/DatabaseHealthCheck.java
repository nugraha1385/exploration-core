package com.indra.practice.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by Indrap on 9/1/2016.
 */
public class DatabaseHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        // TODO: 9/1/2016 Add database health check
        return Result.healthy();
    }
}
