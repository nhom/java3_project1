package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.country.CreateCountryCommand;
import lv.javaguru.java3.core.commands.country.CreateCountryResult;
import lv.javaguru.java3.core.domain.loaction.Country;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.country.CountryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 10-Nov-15.
 */
@Component
public class CreateCountryCommandHandler implements DomainCommandHandler<CreateCountryCommand, CreateCountryResult> {

    @Autowired
    private CountryFactory countryFactory;

    @Override
    public CreateCountryResult execute(CreateCountryCommand command) {
        Country country = countryFactory.create(
                command.getName(),
                command.getCode(),
                command.getPhoneCode()
        );
        return new CreateCountryResult(country);
    }

    @Override
    public Class getCommandType() {
        return CreateCountryCommand.class;
    }
}
