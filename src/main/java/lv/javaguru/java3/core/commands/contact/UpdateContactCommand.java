package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.commands.logincredentials.UpdateLoginCredentialsResult;
import lv.javaguru.java3.core.domain.Country;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class UpdateContactCommand implements DomainCommand<UpdateContactResult> {

    private Long contactId;

    private Country country;
    private int phoneNumber;
    private String email;

    public UpdateContactCommand(Long contactId,
                                         Country country,
                                         int phoneNumber,
                                         String email) {
        this.contactId = contactId;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getContactId() {
        return contactId;
    }

    public Country getCountry() {
        return country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
}
