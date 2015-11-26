package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class CreateContactCommand implements DomainCommand<CreateContactResult> {
    private int countryId;
    private int phoneNumber;
    private String email;

    public CreateContactCommand(int countryId,
                                int phoneNumber,
                                String email) {
        this.countryId = countryId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() { return email; }

    public int getCountryId() {
        return countryId;
    }
}
