package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.logincredentials.GetLoginCredentialsCommand;
import lv.javaguru.java3.core.domain.Country;
import lv.javaguru.java3.core.dto.country.CountryDTO;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edgar on 18-Nov-15.
 */
@Component
public class GetAllCountriesCommandHandler implements DomainCommandHandler<GetAllCountriesCommand, GetAllCountriesResult> {
    @Autowired
    private CountryService countryService;


    @Override
    public GetAllCountriesResult execute(GetAllCountriesCommand command) {
        List<Country> countries = countryService.getAll();
        List<CountryDTO> countriesDTO = new ArrayList<CountryDTO>();
        for(Country country: countries){
            countriesDTO.add(country.getDTO());
        }
        return new GetAllCountriesResult(countriesDTO);
    }

    @Override
    public Class getCommandType() {
        return GetLoginCredentialsCommand.class;
    }
}
