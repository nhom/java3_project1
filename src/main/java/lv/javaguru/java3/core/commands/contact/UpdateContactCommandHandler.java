package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.contact.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 18-Nov-15.
 */
@Component
public class UpdateContactCommandHandler implements DomainCommandHandler<UpdateContactCommand, UpdateContactResult> {
    @Autowired
    private ContactService contactService;


    @Override
    public UpdateContactResult execute(UpdateContactCommand command) {
        Contact contact = contactService.update(
                command.getContactId(),
                command.getCountryId(),
                command.getPhoneNumber(),
                command.getEmail()
        );
        return new UpdateContactResult(contact.getDTO());
    }

    @Override
    public Class getCommandType() {
        return UpdateContactCommand.class;
    }
}
