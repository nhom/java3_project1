package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Edgar on 08-Nov-15.
 */
@Entity
@Table(name="contact")
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="contact_id",unique = true, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name="phone_number", nullable = true)
    private int phoneNumber;

    @Column(name="email", nullable = true)
    private String email;

    @Column(name = "updated", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @Column(name = "created", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
