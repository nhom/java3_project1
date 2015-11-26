package lv.javaguru.java3.core.domain.user;

public class LoginCredentialsBuilder {

    private Long id;
    private String login;
    private String password;


    private LoginCredentialsBuilder() {

    }

    public static LoginCredentialsBuilder createLoginCredentials() {
        return new LoginCredentialsBuilder();
    }

    public LoginCredentials build() {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setId(id);
        loginCredentials.setLogin(login);
        loginCredentials.setPassword(password);
        return loginCredentials;
    }

    public LoginCredentialsBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public LoginCredentialsBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public LoginCredentialsBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

}
