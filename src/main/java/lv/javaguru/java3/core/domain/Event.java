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

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", nullable = true)
    private String description;

    @Column(name = "date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile organizer;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Profile getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Profile organizer) {
        this.organizer = organizer;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }



    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tickets",  joinColumns = {
            @JoinColumn(name = "profile_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "event_id",
                    nullable = false, updatable = false) })
    public Set<Profile> getParticipants() {
        return this.participants;
    }
}
