package com.rest;

import com.bean.Person;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/test")
@Component
public class RestService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person printWelcome() {
        return new Person("anton", "kolhun", new Date());
    }

}