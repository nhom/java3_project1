package lv.javaguru.java3.core.dto.contact;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class ContactDTOBuilder {
    private Long id;
    private Long countryId;
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
        contact.setCountryId(countryId);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        return contact;
    }

    public ContactDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public ContactDTOBuilder withCountryId(Long countryId) {
        this.countryId = countryId;
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
