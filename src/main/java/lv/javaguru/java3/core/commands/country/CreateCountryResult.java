package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.dto.country.CountryDTO;

/**
 * Created by User on 10.11.2015..
 */
public class CreateCountryResult implements DomainCommandResult {

    private CountryDTO country;

    public CreateCountryResult(CountryDTO country) {
        this.country = country;
    }

    public CountryDTO getCountry() {
        return country;
    }
}
