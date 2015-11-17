package lv.javaguru.java3.core.domain;

import java.util.Date;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class CountryBuilder {

    private Long id;
    private String code;
    private String code3;
    private int phoneCode;

    private CountryBuilder() {

    }

    public static CountryBuilder createCountry() {
        return new CountryBuilder();
    }

    public Country build() {
        Country country = new Country();
        country.setId(id);
        country.setCode(code);
        country.setCode3(code3);
        country.setPhoneCode(phoneCode);
        return country;
    }

    public CountryBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public CountryBuilder withCode(String code){
        this.code = code;
        return this;
    }

    public CountryBuilder withCode3(String code3){
        this.code3 = code3;
        return this;
    }

    public CountryBuilder withPhoneCode(int phoneCode){
        this.phoneCode = phoneCode;
        return this;
    }
}
