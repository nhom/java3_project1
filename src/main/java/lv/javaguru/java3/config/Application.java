package lv.javaguru.java3.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"lv.javaguru.java3"})
public class Application {
        public static void main(String[] args) throws Exception{
                SpringApplication.run(Application.class, args);
        }

}
