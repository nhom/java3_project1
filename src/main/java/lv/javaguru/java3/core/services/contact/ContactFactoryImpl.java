package lv.javaguru.java3.core.services.contact;

import lv.javaguru.java3.core.database.contact.ContactDAO;
import lv.javaguru.java3.core.database.country.CountryDAO;
import lv.javaguru.java3.core.database.profile.ProfileDAO;
import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.domain.Profile;
import lv.javaguru.java3.core.dto.country.CountryDTO;
import lv.javaguru.java3.core.services.country.CountryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.ContactBuilder.createContact;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class ContactFactoryImpl implements ContactFactory {

    @Autowired private ContactValidator contactValidator;
    @Autowired private ContactDAO contactDAO;


    @Override
    public Contact create(Country country, int phoneNumber, String email) {
        contactValidator.validate(phoneNumber, email);

        Contact contact = createContact()
                .withCountry(country)
                .withPhone(phoneNumber)
                .withEmail(email)
                .build();

        contactDAO.create(contact);

        return contact;
    }
}
