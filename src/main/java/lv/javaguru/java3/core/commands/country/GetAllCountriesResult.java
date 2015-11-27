package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.dto.country.CountryDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edgar on 18-Nov-15.
 */
public class GetAllCountriesResult implements DomainCommandResult {
    private List<CountryDTO> countries;

    public GetAllCountriesResult(List<CountryDTO> countries) {
        this.countries = countries;
    }

    public List<CountryDTO> getCountries() {
        return countries;
    }
}
