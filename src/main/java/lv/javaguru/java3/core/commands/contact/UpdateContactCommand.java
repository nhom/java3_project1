package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.dto.ContactDTO;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class UpdateContactCommand implements DomainCommand<UpdateContactResult> {

    private Long contactId;

    private ContactDTO contact;

    public UpdateContactCommand(ContactDTO contact) {
       this.contact = contact;
    }


    public ContactDTO getContact() {
        return contact;
    }
}
