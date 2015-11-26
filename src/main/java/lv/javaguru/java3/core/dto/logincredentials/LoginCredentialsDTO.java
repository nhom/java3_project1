package lv.javaguru.java3.core.dto.logincredentials;

import java.util.Date;

/**
 * Created by Edgar on 18-Nov-15.
 */
public class LoginCredentialsDTO {
    private Long id;
    private String login;
    private String password;
    private Date updated;
    private Date created;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Date getUpdated() {
        return updated;
    }

    public Date getCreated() {
        return created;
    }
}
