package com.rest;


import junit.framework.Assert;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerException;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Test;
import org.springframework.web.context.ContextLoaderListener;

/**
 * Created by akolhun on 19.08.2014.
 */
public class ITRestService extends JerseyTest {


    @Test
    public void testPrintWelcome() {
        String response  = target().path("/test/").request().get(String.class);
        Assert.assertNotNull(response);
    }


    @Override
    protected TestContainerFactory getTestContainerFactory() throws TestContainerException {
        return new GrizzlyWebTestContainerFactory();
    }


    @Override
    protected DeploymentContext configureDeployment() {
        return ServletDeploymentContext
                .forServlet(new ServletContainer(new ResourceConfig().packages("com.rest")))
                .addListener(ContextLoaderListener.class)
                .contextPath("/")
                .contextParam("contextConfigLocation","classpath:applicationContext.xml")
                .build();
    }
}
