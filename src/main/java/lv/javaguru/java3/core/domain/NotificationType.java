package lv.javaguru.java3.core.domain;

import javax.persistence.*;

/**
 * Created by Vladislav on 11/10/2015.
 */
@Entity
@Table(name="notification_type")
public class NotificationType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="status_id",unique = true, nullable = false)
    Long id;

    @Column(name="title", nullable = false)
    String title;
}
