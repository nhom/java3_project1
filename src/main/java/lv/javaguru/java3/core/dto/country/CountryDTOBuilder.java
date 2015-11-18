package lv.javaguru.java3.core.dto.country;

import lv.javaguru.java3.core.dto.contact.ContactDTO;

/**
 * Created by Edgar on 17-Nov-15.
 */
public class CountryDTOBuilder {
    private Long id;
    private String code;
    private int phoneCode;
    private String name;

    public static CountryDTOBuilder createCountryDTO() {
        return new CountryDTOBuilder();
    }

    public CountryDTO build() {
        CountryDTO country = new CountryDTO();
        country.setId(this.id);
        country.setCode(this.code);
        country.setPhoneCode(this.phoneCode);
        country.setName(this.name);
        return country;
    }

    public CountryDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public CountryDTOBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public CountryDTOBuilder withPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public CountryDTOBuilder withName(String name){
        this.name = name;
        return this;
    }

}
