package lv.javaguru.java3.core.commands.country;

import lv.javaguru.java3.core.commands.DomainCommand;

/**
 * Created by User on 10.11.2015..
 */
public class UpdateCountryCommand implements DomainCommand<UpdateCountryResult> {

    private Long countryId;

    private String code;
    private String code3;
    private int phoneCode;
    private String name;

    public UpdateCountryCommand(Long countryId,
                                String code,
                                String code3,
                                int phoneCode,
                                String name) {
        this.countryId = countryId;
        this.code = code;
        this.code3 = code3;
        this.phoneCode = phoneCode;
        this.name = name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public String getCode() {
        return code;
    }

    public String getCode3() {
        return code3;
    }

    public int getPhoneCode() { return phoneCode; }

    public String getName() {
        return name;
    }
}