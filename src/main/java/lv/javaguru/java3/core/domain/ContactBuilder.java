package lv.javaguru.java3.core.domain;

import java.util.Date;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class ContactBuilder {

    private Long id;
    private Country country;
    private int phoneNumber;
    private String email;

    private ContactBuilder() {

    }

    public static ContactBuilder createContact() {
        return new ContactBuilder();
    }

    public Contact build() {
        Contact contact = new Contact();
        contact.setId(id);
        contact.setCountry(country);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contact.setCreated(new Date());
        return contact;
    }

    public ContactBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public ContactBuilder withCountry(Country country){
        this.country = country;
        return this;
    }

    public ContactBuilder withPhone(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ContactBuilder withEmail(String email){
        this.email = email;
        return this;
    }
}
