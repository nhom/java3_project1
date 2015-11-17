package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.dto.contact.ContactDTO;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class GetContactResult  implements DomainCommandResult {

    private ContactDTO contact;

    public GetContactResult(ContactDTO contact) {
        this.contact = contact;
    }

    public ContactDTO getContact() {
        return contact;
    }

}