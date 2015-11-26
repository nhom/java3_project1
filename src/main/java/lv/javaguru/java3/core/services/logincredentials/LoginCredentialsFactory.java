package lv.javaguru.java3.core.services.logincredentials;

import lv.javaguru.java3.core.domain.user.LoginCredentials;

public interface LoginCredentialsFactory {

    LoginCredentials create(String login, String password);

}
