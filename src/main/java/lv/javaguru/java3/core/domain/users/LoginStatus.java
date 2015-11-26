package lv.javaguru.java3.core.domain.users;

import javax.persistence.*;

/**
 * Created by Vladislav on 11/10/2015.
 */
@Entity
@Table(name="login_status")
public class LoginStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="status_id",unique = true, nullable = false)
    Long id;

    @Column(name="title", nullable = false)
    String title;
}
