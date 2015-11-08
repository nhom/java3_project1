package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Edgar on 07-Nov-15.
 */
@Entity
@Table(name="events")
public class Event {

    // Attributes
    private Set<Profile> participants;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="event_id",unique = true, nullable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String title;

    @Column(name="name", nullable = true)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile author;

    @Column(name = "updated", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @Column(name = "created", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    // Functions
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "participants_events",  joinColumns = {
            @JoinColumn(name = "profile_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "event_id",
                    nullable = false, updatable = false) })
    public Set<Profile> getParticipants() {
        return this.participants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Profile getAuthor() {
        return author;
    }

    public void setAuthor(Profile author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
