package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.dto.country.CountryDTO;

/**
 * Created by User on 10.11.2015..
 */
public class CreateCountryCommand implements DomainCommand<CreateCountryResult> {

    private String code;
    private int phoneCode;
    private String name;

    public CreateCountryCommand(CountryDTO country){
        this.code = country.getCode();
        this.phoneCode = country.getPhoneCode();
        this.name = country.getName();
    }

    public CreateCountryCommand(String code, int phoneCode, String name) {
        this.code = code;
        this.phoneCode = phoneCode;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public String getName() {
        return name;
    }
}
