package com.rest;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.TestContainerException;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import com.sun.jersey.test.framework.spi.container.grizzly.web.GrizzlyWebTestContainerFactory;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.web.context.ContextLoaderListener;

/**
 * Created by akolhun on 19.08.2014.
 */
public class ITRestService extends JerseyTest {

    public ITRestService() throws TestContainerException {
        super(new WebAppDescriptor.Builder("com.rest")
                .contextPath("/")
                .contextParam("contextConfigLocation", "classpath*:applicationContext.xml")
                .servletClass(SpringServlet.class)
                .contextListenerClass(ContextLoaderListener.class)
                .build());
    }

    @Test
    public void testPrintWelcome() {
        String response  = resource().path("/test/").get(String.class);
        Assert.assertEquals("hello", response);
    }

}
