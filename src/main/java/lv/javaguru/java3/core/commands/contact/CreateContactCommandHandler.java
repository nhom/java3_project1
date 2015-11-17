package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsCommand;
import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsResult;
import lv.javaguru.java3.core.database.country.CountryDAO;
import lv.javaguru.java3.core.database.profile.ProfileDAO;
import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.domain.LoginCredentials;
import lv.javaguru.java3.core.domain.Profile;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.contact.ContactFactory;
import lv.javaguru.java3.core.services.logincredentials.LoginCredentialsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 17-Nov-15.
 */
@Component
public class CreateContactCommandHandler implements DomainCommandHandler<CreateContactCommand, CreateContactResult> {
    @Autowired private ContactFactory contactFactory;
    @Autowired private CountryDAO countryDAO;

    // sdesj nado ispolzovatj DTO vizde v ostalnom proekte ISPOLZOVATJ DOMAIN OBJECTI!!!!!!
    @Override
    public CreateContactResult execute(CreateContactCommand command) {
        Country country = countryDAO.getById(command.getCountryId());

        Contact contact = contactFactory.create(
                country,
                command.getPhoneNumber(),
                command.getEmail()
        );
        return new CreateContactResult(contact);
    }

    @Override
    public Class getCommandType() {
        return CreateLoginCredentialsCommand.class;
    }
}
