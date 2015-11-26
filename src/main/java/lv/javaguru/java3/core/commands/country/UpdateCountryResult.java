package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.Country;

/**
 * Created by User on 10.11.2015..
 */
public class UpdateCountryResult implements DomainCommandResult {

    private Country country;

    public UpdateCountryResult(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
