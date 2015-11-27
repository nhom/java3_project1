package lv.javaguru.java3.core.database.logincredentials;

import lv.javaguru.java3.core.domain.LoginCredentials;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import static lv.javaguru.java3.core.domain.LoginCredentialsBuilder.createLoginCredentials;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class LoginCredentialsDAOImplTest extends DatabaseHibernateTest {

    @Test
    @Transactional
    public void testCreateClient() {
        LoginCredentials loginCredentials = createLoginCredentials()
                .withLogin("login")
                .withPassword("password").build();
        assertThat(loginCredentials.getId(), is(nullValue()));
        loginCredentialsDAO.create(loginCredentials);
        assertThat(loginCredentials.getId(), is(notNullValue()));
    }

    @Test
    @Transactional
    public void testGetClientById() {
        LoginCredentials loginCredentials = createLoginCredentials()
                .withLogin("login")
                .withPassword("password").build();
        loginCredentialsDAO.create(loginCredentials);
        LoginCredentials loginCredentialsFromDb = loginCredentialsDAO.getById(loginCredentials.getId());
        assertThat(loginCredentialsFromDb, is(notNullValue()));
    }

    @Test
    @Transactional
    public void testDeleteClients(){
        loginCredentialsDAO.deleteAll();
        assertThat(loginCredentialsDAO.getAll().size(), is(0));
    }

}