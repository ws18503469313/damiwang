package com.cloud.consumer.config;

import com.cloud.consumer.inteface.ExcludeCompoentScan;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@ExcludeCompoentScan
//@Configuration
public class RibbonConfig {

    @Autowired
    public IClientConfig config;

    public IRule ribbonRule(IClientConfig config) {
        return new WeightedResponseTimeRule();
    }
}