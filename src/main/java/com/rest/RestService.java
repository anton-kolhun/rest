package com.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
@Component
public class RestService {
    @GET
    public String printWelcome() {
        return "hello";
    }

}