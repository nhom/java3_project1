package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.dto.logincredentials.LoginCredentialsDTO;

public class CreateLoginCredentialsCommand implements DomainCommand<CreateLoginCredentialsResult> {

    private String login;
    private String password;

    public CreateLoginCredentialsCommand(LoginCredentialsDTO loginCredentials) {
        this.login = loginCredentials.getLogin();
        this.password = loginCredentials.getPassword();
    }

    public CreateLoginCredentialsCommand(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}