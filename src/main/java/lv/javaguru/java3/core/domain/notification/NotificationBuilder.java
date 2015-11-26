package lv.javaguru.java3.core.domain.notification;

import java.util.Date;

/**
 * Created by Vladislav on 11/26/2015.
 */
public class NotificationBuilder {
    /* TO DO */
    Long id;
    String title;
    String description;
    Date created;
    NotificationType type;
    NotificationStatus status;

    private NotificationBuilder(){

    }

    public static NotificationBuilder createNotificationBuilder() { return new NotificationBuilder();}

    public Notification build(){
        Notification notification = new Notification();
        notification.setId(id);
        notification.setTitle(title);
        notification.setDescription(description);
        notification.setCreated(created);
        notification.setType(type);
        notification.setStatus(status);
        return notification;
    }

    public NotificationBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public NotificationBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public NotificationBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public NotificationBuilder withCreated(Date created) {
        this.created = created;
        return this;
    }

    public NotificationBuilder withType(NotificationType type) {
        this.type = type;
        return this;
    }

    public NotificationBuilder withStatus(NotificationStatus status) {
        this.status = status;
        return this;
    }
}
