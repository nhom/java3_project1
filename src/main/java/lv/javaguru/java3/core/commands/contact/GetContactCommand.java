package lv.javaguru.java3.core.commands.contact;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.commands.logincredentials.GetLoginCredentialsResult;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class GetContactCommand implements DomainCommand<GetContactResult> {
    private Long contactId;

    public GetContactCommand(Long contactId) {
        this.contactId = contactId;
    }

    public Long getContactId() {
        return contactId;
    }
}
