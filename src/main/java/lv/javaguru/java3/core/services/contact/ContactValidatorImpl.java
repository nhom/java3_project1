package lv.javaguru.java3.core.services.contact;

import lv.javaguru.java3.core.domain.Contact;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.domain.Profile;
import lv.javaguru.java3.core.services.country.CountryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.apache.commons.lang.StringUtils.isBlank;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class ContactValidatorImpl implements ContactValidator {
    @Autowired CountryValidator countryValidator;


    @Override
    public void validate(int phoneNumber, String email) {
        validatePhoneNumber(phoneNumber);
        validateEmail(email);
    }


    private void validateEmail(String email) {
        checkNotNull(email, "Email must not be null");
        checkArgument(!isBlank(email), "Email must not be empty");
    }

    private void validatePhoneNumber(int phoneNumber) {
        checkNotNull(phoneNumber, "Phone number code must not be null");
    }
}
