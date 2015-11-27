package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.country.GetCountryCommand;
import lv.javaguru.java3.core.commands.country.GetCountryResult;
import lv.javaguru.java3.core.commands.logincredentials.GetLoginCredentialsCommand;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class GetCountryCommandHandler implements DomainCommandHandler<GetCountryCommand, GetCountryResult> {
    @Autowired
    private CountryService countryService;


    @Override
    public GetCountryResult execute(GetCountryCommand command) {
        Country country = countryService.get(command.getCountryId());
        return new GetCountryResult(country.getDTO());
    }

    @Override
    public Class getCommandType() {
        return GetLoginCredentialsCommand.class;
    }
}
