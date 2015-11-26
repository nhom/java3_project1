package lv.javaguru.java3.core.services.contact;

import lv.javaguru.java3.core.database.contact.ContactDAO;
import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;
    @Autowired private ContactValidator contactValidator;
    @Autowired private CountryService countryService;

    @Override
    public Contact update(Long contactId, Long countryId, int phoneNumber, String email) {
        contactValidator.validate(phoneNumber, email);

        Country country = countryService.get(countryId);

        Contact contact = get(contactId);
        contact.setCountry(country);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        return contact;
    }

    @Override
    public Contact get(Long contactId) {
        return contactDAO.getRequired(contactId);
    }
}
