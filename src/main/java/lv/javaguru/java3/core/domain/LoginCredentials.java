package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="logincredentials")
public class LoginCredentials {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id",unique = true, nullable = false)
    private Long id;

    @Column(name="login", nullable = false)
    private String login;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name = "created", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "last_login", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

//    @OneToOne
//    @JoinColumn(name = "profile_id")
//    private Profile profile;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

//    public Profile getProfile() {
//        return profile;
//    }
}
