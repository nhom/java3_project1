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
    private int id;

    @OneToOne
    @JoinColumn(name = "country_id")
    Country country;

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
}
