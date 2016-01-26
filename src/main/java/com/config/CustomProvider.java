package com.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.ext.Provider;

/**
 * Created by akolhun on 04.12.2015.
 */
@Provider
public class CustomProvider extends JacksonJaxbJsonProvider {

    @Autowired
    private TestComponent testComponent;

    public CustomProvider() {
        System.out.println("gdaaaaa");
    }

}
