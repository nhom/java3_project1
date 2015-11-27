package lv.javaguru.java3.core.services.country;

import lv.javaguru.java3.core.database.country.CountryDAO;
import lv.javaguru.java3.core.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;
    @Autowired private CountryValidator countryValidator;

    @Override
    public Country update(Long countryId, String newName, String newCode, int newPhoneCode) {
        countryValidator.validate(newName, newCode, newPhoneCode);
        Country country = get(countryId);
        country.setName(newName);
        country.setCode(newCode);
        country.setPhoneCode(newPhoneCode);
        return country;
    }

    @Override
    public Country get(Long countryId) {
        return countryDAO.getRequired(countryId);
    }

    @Override
    public List<Country> getAll() {
        return countryDAO.getAll();
    }
}
