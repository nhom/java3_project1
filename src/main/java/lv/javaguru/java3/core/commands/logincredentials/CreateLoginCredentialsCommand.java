package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommand;

public class CreateLoginCredentialsCommand implements DomainCommand<CreateLoginCredentialsResult> {

    private String login;
    private String password;


    public CreateLoginCredentialsCommand(String login,
                                         String password) {
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
