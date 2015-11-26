package lv.javaguru.java3.core.services.country;

import lv.javaguru.java3.core.database.location.country.CountryDAO;
import lv.javaguru.java3.core.domain.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.CountryBuilder.createCountry;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class CountryFactoryImpl implements CountryFactory{

    @Autowired private CountryValidator countryValidator;
    @Autowired private CountryDAO countryDAO;

    @Override
    public Country create(String name, String countryCode, int phoneCode) {
        countryValidator.validate(name, countryCode, phoneCode);

        Country country = createCountry()
                .withName(name)
                .withCode(countryCode)
                .withPhoneCode(phoneCode)
                .build();
        countryDAO.create(country);
        return country;
    }
}
