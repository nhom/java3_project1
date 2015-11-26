package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.user.Contact;
import lv.javaguru.java3.core.domain.user.LoginCredentials;
import lv.javaguru.java3.core.dto.ContactDTO;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class CreateContactResult implements DomainCommandResult {

    private ContactDTO contact;

    public CreateContactResult(ContactDTO contact) {
        this.contact = contact;
    }

    public ContactDTO getContact() {
        return contact;
    }
}
