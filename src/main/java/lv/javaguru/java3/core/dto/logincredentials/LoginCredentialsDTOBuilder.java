package lv.javaguru.java3.core.dto.logincredentials;

import lv.javaguru.java3.core.dto.country.CountryDTO;

import java.util.Date;

/**
 * Created by Edgar on 18-Nov-15.
 */
public class LoginCredentialsDTOBuilder {
    private Long id;
    private String login;
    private String password;
    private Date updated;
    private Date created;

    public static LoginCredentialsDTOBuilder createLoginCredentialsDTO() {
        return new LoginCredentialsDTOBuilder();
    }

    public LoginCredentialsDTO build() {
        LoginCredentialsDTO loginCredentials = new LoginCredentialsDTO();
        loginCredentials.setId(this.id);
        loginCredentials.setLogin(this.login);
        loginCredentials.setPassword(this.password);
        return loginCredentials;
    }

    public LoginCredentialsDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public LoginCredentialsDTOBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public LoginCredentialsDTOBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginCredentialsDTOBuilder withUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public LoginCredentialsDTOBuilder withCreated(Date created){
        this.created = created;
        return this;
    }
}
