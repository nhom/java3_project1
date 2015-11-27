package lv.javaguru.java3.core.services.contact;

import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 10-Nov-15.
 */

public interface ContactService {
    Contact update(Long contactId, Long countryId, int phoneNumber, String email);

    Contact get(Long contactId);
}
