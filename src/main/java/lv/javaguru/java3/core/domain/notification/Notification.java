package lv.javaguru.java3.core.domain.notification;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vladislav on 11/26/2015.
 */
public class Notification {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="status_id",unique = true, nullable = false)
    int id;

    @Column(name="title",unique = true, nullable = false)
    String title;

    @Column(name="description",unique = true, nullable = false)
    String description;


    @Column(name="created",unique = true, nullable = false)
    Date created;


    @OneToOne
    @JoinColumn(name = "type_id")
    NotificationType type;

    @OneToOne
    @JoinColumn(name = "status_id")
    NotificationStatus status;

    //Event event;
    //Profile recepient;


    public int getId() {
        return id;
    }

    private void setId(int id) {
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public NotificationStatus getStatus() {
        return status;
    }

    public void setStatus(NotificationStatus status) {
        this.status = status;
    }
}
