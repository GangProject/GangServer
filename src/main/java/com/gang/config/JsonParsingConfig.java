package com.gang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by iljun on 2017-06-16.
 */
@Configuration
public class JsonParsingConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
