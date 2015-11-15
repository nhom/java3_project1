package lv.javaguru.java3.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Created by Vladislav on 11/15/2015.
 */
@Component
@Path("/test")
public class TestResource {

    @GET
    @Produces("text/html")
    public String getTest(){
        return "success";
    }
}
