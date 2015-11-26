package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.country.UpdateCountryCommand;
import lv.javaguru.java3.core.commands.country.UpdateCountryResult;
import lv.javaguru.java3.core.domain.loaction.Country;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class UpdateCountryCommandHandler implements DomainCommandHandler<UpdateCountryCommand, UpdateCountryResult> {

    @Autowired
    private CountryService countryService;

    @Override
    public UpdateCountryResult execute(UpdateCountryCommand command) {
        Country country = countryService.update(
                command.getCountryId(),
                command.getName(),
                command.getCode(),
                command.getPhoneCode()
        );
        return new UpdateCountryResult(country);
    }

    @Override
    public Class getCommandType() {
        return UpdateCountryCommand.class;
    }
}
