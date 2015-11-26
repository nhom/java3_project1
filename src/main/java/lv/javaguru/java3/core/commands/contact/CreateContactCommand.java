package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsResult;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.domain.CountryBuilder;

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