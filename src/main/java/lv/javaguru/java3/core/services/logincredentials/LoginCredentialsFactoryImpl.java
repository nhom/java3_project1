package lv.javaguru.java3.core.services.logincredentials;

import lv.javaguru.java3.core.database.user.logincredentials.LoginCredentialsDAO;
import lv.javaguru.java3.core.domain.user.LoginCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.user.LoginCredentialsBuilder.createLoginCredentials;

@Component
class LoginCredentialsFactoryImpl implements LoginCredentialsFactory {

    @Autowired private LoginCredentialsValidator loginCredentialsValidator;
    @Autowired private LoginCredentialsDAO loginCredentialsDAO;

    @Override
    public LoginCredentials create(String login, String password) {
        loginCredentialsValidator.validate(login, password);
        LoginCredentials loginCredentials = createLoginCredentials()
                .withLogin(login)
                .withPassword(password)
                .build();
        loginCredentialsDAO.create(loginCredentials);
        return loginCredentials;
    }

}
