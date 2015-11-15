package lv.javaguru.java3.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
@EntityScan(basePackages = "lv.javaguru.java3.core.domain")
public class HibernateConfig {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public SessionFactory getSessionFactory() throws Exception {
        if (entityManagerFactory.unwrap(SessionFactory.class) == null)
            throw new NullPointerException("Factory is not a hibernate factory");
        return entityManagerFactory.unwrap(SessionFactory.class);
    }

}
