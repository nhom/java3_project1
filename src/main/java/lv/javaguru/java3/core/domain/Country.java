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
    private Long id;

    @Column(name="code", nullable = true)
    private String code;

    @Column(name="phone_code", nullable = true)
    private int phoneCode;

    @Column(name="name", nullable = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
