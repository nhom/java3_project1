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
public class GetContactCommandHandler implements DomainCommandHandler<GetContactCommand, GetContactResult> {
    @Autowired
    private ContactService contactService;


    @Override
    public GetContactResult execute(GetContactCommand command) {
        Contact contact = contactService.get(command.getContactId());

        return new GetContactResult(contact.getDTO());
    }

    @Override
    public Class getCommandType() {
        return GetContactCommand.class;
    }

}
