package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="profile")
public class Profile {

    private Set<Event> participatedEvents = new HashSet<>(0);
    private Set<Event> organizedEvents = new HashSet<>(0);

    // Attributes
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="profile_id",unique = true, nullable = false)
    private Long id;

    @Column(name="name", nullable = true)
    private String name;

    @Column(name="surname", nullable = true)
    private String surname;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "login_credentials_id")
    private LoginCredentials loginCredentials;

    @Column(name = "updated", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @Column(name = "created", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    // Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Contact
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    // Organized events
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organizer")
    public Set<Event> getOrganizedEvents() {
        return this.organizedEvents;
    }

    public void setOrganizedEvents(Set<Event> organizedEvents) {
        this.organizedEvents = organizedEvents;
    }

    // Participated events
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "participant")
    public Set<Event> getParticipatedEvents() {
        return this.participatedEvents;
    }

    public void setParticipatedEvents(Set<Event> participatedEvents) {
        this.participatedEvents = participatedEvents;
    }

    // Updated
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    // Created
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    // Login credentials
    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

    public void setLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }
}
