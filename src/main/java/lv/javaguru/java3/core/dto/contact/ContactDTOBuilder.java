package lv.javaguru.java3.core.dto.contact;

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

    public ContactDTOBuilder withPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public ContactDTOBuilder withPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ContactDTOBuilder withEmail(String email){
        this.email = email;
        return this;
    }
}
