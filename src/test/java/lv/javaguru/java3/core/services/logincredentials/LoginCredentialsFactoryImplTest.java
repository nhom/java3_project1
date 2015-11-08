package lv.javaguru.java3.core.services.logincredentials;

import lv.javaguru.java3.core.database.LoginCredentialsDAO;
import lv.javaguru.java3.core.domain.LoginCredentials;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoginCredentialsFactoryImplTest {

    @Mock private LoginCredentialsValidator loginCredentialsValidator;
    @Mock private LoginCredentialsDAO loginCredentialsDAO;

    @InjectMocks
    private LoginCredentialsFactory loginCredentialsFactory = new LoginCredentialsFactoryImpl();

    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";


    @Test
    public void createShouldInvokeValidator() {
        loginCredentialsFactory.create(LOGIN, PASSWORD);
        verify(loginCredentialsValidator).validate(LOGIN, PASSWORD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createShouldFailIfValidationFail() {
        doThrow(new IllegalArgumentException())
                .when(loginCredentialsValidator).validate(LOGIN, PASSWORD);
        loginCredentialsFactory.create(LOGIN, PASSWORD);
    }

    @Test
    public void createShouldPersistClientAfterValidation() {
        LoginCredentials loginCredentials = loginCredentialsFactory.create(LOGIN, PASSWORD);
        InOrder inOrder = inOrder(loginCredentialsValidator, loginCredentialsDAO);
        inOrder.verify(loginCredentialsValidator).validate(LOGIN, PASSWORD);
        inOrder.verify(loginCredentialsDAO).create(loginCredentials);
    }

    @Test
    public void createShouldReturnNewClient() {
        LoginCredentials loginCredentials = loginCredentialsFactory.create(LOGIN, PASSWORD);
        assertThat(loginCredentials.getLogin(), is(LOGIN));
        assertThat(loginCredentials.getPassword(), is(PASSWORD));
    }

}
