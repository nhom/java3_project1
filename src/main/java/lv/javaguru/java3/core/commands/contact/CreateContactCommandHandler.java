package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsCommand;
import lv.javaguru.java3.core.database.country.CountryDAO;
import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.contact.ContactFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 17-Nov-15.
 */
@Component
public class CreateContactCommandHandler implements DomainCommandHandler<CreateContactCommand, CreateContactResult> {
    @Autowired private ContactFactory contactFactory;
    // we can use here DAO objects
    @Autowired private CountryDAO countryDAO;

    @Override
    public CreateContactResult execute(CreateContactCommand command) {
        Country country = countryDAO.getById(command.getCountryId());

        Contact contact = contactFactory.create(
                country,
                command.getPhoneNumber(),
                command.getEmail()
        );

        return new CreateContactResult(contact.getDTO());
    }

    @Override
    public Class getCommandType() {
        return CreateLoginCredentialsCommand.class;
    }
}
