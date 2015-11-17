package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.LoginCredentials;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class GetContactResult  implements DomainCommandResult {

    private Contact contact;

    public GetContactResult(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

}