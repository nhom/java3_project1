package lv.javaguru.java3.config;

import lv.javaguru.java3.rest.TestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vladislav on 11/15/2015.
 */

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(TestResource.class);
    }
}
