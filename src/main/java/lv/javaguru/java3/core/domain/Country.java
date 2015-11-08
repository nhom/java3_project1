package lv.javaguru.java3.core.domain;

import javax.persistence.*;

/**
 * Created by Edgar on 08-Nov-15.
 */
@Entity
@Table(name="countries")
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="country_id",unique = true, nullable = false)
    private int id;

    @Column(name="code", nullable = true)
    private String code;

    @Column(name="code3", nullable = true)
    private String code3;

    @Column(name="phone_code", nullable = true)
    private int phoneCode;
}
