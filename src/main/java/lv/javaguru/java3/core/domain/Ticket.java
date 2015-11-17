package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 10.11.2015..
 */
@Entity
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ticket_id",unique = true, nullable = false)
    private Long id;

    @Column(name="price", nullable = true)
    private int price;

    @Column(name = "date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToMany
    @JoinColumn(name = "event_id")
    private Event event;

    @OneToMany
    @JoinColumn(name = "profile_id")
    private Profile participant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Profile getParticipant() {
        return participant;
    }

    public void setParticipant(Profile participant) {
        this.participant = participant;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
