package lv.javaguru.java3.core.services.contact;

import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.domain.Profile;

/**
 * Created by Edgar on 10-Nov-15.
 */
public interface ContactFactory {
    Contact create(Country country, int phoneNumber, String email);
}
