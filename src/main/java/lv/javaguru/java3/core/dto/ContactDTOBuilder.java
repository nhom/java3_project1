package lv.javaguru.java3.core.dto;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class ContactDTOBuilder {
    private Long id;
    private String countryName;
    private String countryCode;
    private int phoneCode;
    private int phoneNumber;
    private String email;


    private ContactDTOBuilder() {

    }

    public static ContactDTOBuilder createContactDTO() {
        return new ContactDTOBuilder();
    }

    public ContactDTO build() {
        ContactDTO contact = new ContactDTO();
        contact.setId(id);
        contact.setCountryName(countryName);
        contact.setCountryCode(countryCode);
        contact.setPhoneCode(phoneCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        return contact;
    }

    public ContactDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public ContactDTOBuilder withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public ContactDTOBuilder withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}
