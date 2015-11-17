package lv.javaguru.java3.core.dto;

import java.io.Serializable;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class ContactDTO implements Serializable {
    private Long id;
    private String countryName;
    private String countryCode;
    private int phoneCode;
    private int phoneNumber;
    private String email;

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
