package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.loaction.Country;

/**
 * Created by User on 10.11.2015..
 */
public class GetCountryResult implements DomainCommandResult {

    private Country country;

    public GetCountryResult(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
