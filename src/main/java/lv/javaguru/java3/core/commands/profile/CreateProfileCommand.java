package lv.javaguru.java3.core.commands.profile;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.user.Contact;
import lv.javaguru.java3.core.domain.user.LoginCredentials;

/**
 * Created by User on 10.11.2015..
 */
public class CreateProfileCommand implements DomainCommand<CreateProfileResult> {

    private String name;
    private String surname;
    private Contact contact;
    private LoginCredentials loginCredentials;

    public CreateProfileCommand(String name, String surname, Contact contact, LoginCredentials loginCredentials) {
        this.name = name;
        this.surname = surname;

        this.contact = contact;
        this.loginCredentials = loginCredentials;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Contact getContact() {
        return contact;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }
}
