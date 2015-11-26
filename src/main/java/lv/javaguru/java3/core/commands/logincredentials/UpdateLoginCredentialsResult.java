package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.user.LoginCredentials;

public class UpdateLoginCredentialsResult implements DomainCommandResult {

    private LoginCredentials loginCredentials;

    public UpdateLoginCredentialsResult(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

}
