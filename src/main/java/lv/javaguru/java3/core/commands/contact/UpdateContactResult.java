package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.user.Contact;
import lv.javaguru.java3.core.domain.user.LoginCredentials;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class UpdateContactResult implements DomainCommandResult {

    private Contact contact;

    public UpdateContactResult(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }
}
