package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 10.11.2015..
 */
@Entity
@Table(name="tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ticket_id",unique = true, nullable = false)
    private Long id;

    @Column(name="price", nullable = true)
    private int price;

    @Column(name = "purchaseDate", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;

    @Transient // ************************** CHANGE THIS LATER
    @OneToMany
    @JoinColumn(name = "event_id")
    private Event event;

    @Transient
    @OneToMany
    @JoinColumn(name = "profile_id")
    private Profile owner;

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

    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
