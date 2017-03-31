package com.gang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by iljun on 2017-03-17.
 */
@Configuration
@EnableWebMvc
public class MyWebConfig extends WebMvcConfigurationSupport {

    @Bean//global로 적용하기 위해 Bean Tag로 적용
    public WebMvcConfigurer corsConfigure(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");//개발중이기때문에 모든 url open
            }
        };
    }
}
