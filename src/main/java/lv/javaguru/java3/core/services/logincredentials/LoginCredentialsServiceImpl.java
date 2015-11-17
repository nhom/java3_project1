package lv.javaguru.java3.core.services.logincredentials;

import lv.javaguru.java3.core.database.logincredentials.LoginCredentialsDAO;
import lv.javaguru.java3.core.domain.LoginCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class LoginCredentialsServiceImpl implements LoginCredentialsService {

    @Autowired private LoginCredentialsDAO loginCredentialsDAO;
    @Autowired private LoginCredentialsValidator loginCredentialsValidator;


    @Override
    public LoginCredentials update(Long clientId,
                         String newLogin,
                         String newPassword) {
        loginCredentialsValidator.validate(newLogin, newPassword);
        LoginCredentials loginCredentials = get(clientId);
        loginCredentials.setLogin(newLogin);
        loginCredentials.setPassword(newPassword);
        return loginCredentials;
    }

    @Override
    public LoginCredentials get(Long clientId) {
        return loginCredentialsDAO.getRequired(clientId);
    }

}
