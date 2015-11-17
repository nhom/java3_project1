package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommand;

/**
 * Created by User on 10.11.2015..
 */
public class GetCountryCommand implements DomainCommand<GetCountryResult> {

    private Long countryId;

    public GetCountryCommand(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountryId() {
        return countryId;
    }

}
