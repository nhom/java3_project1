package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsResult;
import lv.javaguru.java3.core.domain.Country;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class CreateContactCommand implements DomainCommand<CreateLoginCredentialsResult> {

    private Country country;
    private int phoneNumber;
    private String email;

    public CreateContactCommand(Country country, int phoneNumber, String email) {
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Country getCountry() {
        return country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() { return email; }
}
