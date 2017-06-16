package com.gang.config;

import com.gang.GangApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by iljun on 2017-06-13.
 */
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException{
        AnnotationConfigWebApplicationContext applicationContextWebApplicationContext = new AnnotationConfigWebApplicationContext();
        applicationContextWebApplicationContext.register(GangApplication.class);
        applicationContextWebApplicationContext.setServletContext(servletContext);
        applicationContextWebApplicationContext.refresh();

        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContextWebApplicationContext));
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
        dynamic.setMultipartConfig(applicationContextWebApplicationContext.getBean(MultipartConfigElement.class));
    }
}
