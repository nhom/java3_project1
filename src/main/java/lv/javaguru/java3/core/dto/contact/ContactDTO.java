package lv.javaguru.java3.core.dto.contact;

import java.io.Serializable;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class ContactDTO implements Serializable {
    private Long id;
    private Long countryId;
    private int phoneNumber;
    private String email;

    // id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // country_id
    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    // phone_number
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
