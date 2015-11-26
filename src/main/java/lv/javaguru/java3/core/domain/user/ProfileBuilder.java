package lv.javaguru.java3.core.domain.user;

import java.util.Date;

/**
 * Created by Edgar on 08-Nov-15.
 */
public class ProfileBuilder {

    private Long id;
    private String name;
    private String surname;
    private Contact contact;
    private LoginCredentials loginCredentials;

    private ProfileBuilder() {

    }

    public static ProfileBuilder createProfile() {
        return new ProfileBuilder();
    }

    public Profile build() {
        Profile profile = new Profile();
        profile.setId(id);
        profile.setName(name);
        profile.setSurname(surname);
        profile.setLoginCredentials(loginCredentials);
        profile.setContact(contact);
        profile.setCreated(new Date());
        return profile;
    }

    public ProfileBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public ProfileBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProfileBuilder withSurname(String surname){
        this.surname = surname;
        return this;
    }

    public ProfileBuilder withContact(Contact contact){
        this.contact = contact;
        return this;
    }

    public ProfileBuilder withLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
        return this;
    }
}
