package lv.javaguru.java3.core.domain;

/**
 * Created by Edgar on 09-Nov-15.
 */
public class CountryBuilder {

    private Long id;
    private String code;
    private int phoneCode;
    private String name;

    private CountryBuilder() {

    }

    public static CountryBuilder createCountry() {
        return new CountryBuilder();
    }

    public Country build() {
        Country country = new Country();
        country.setId(id);
        country.setCode(code);
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

    public CountryBuilder withPhoneCode(int phoneCode){
        this.phoneCode = phoneCode;
        return this;
    }

    public CountryBuilder withName(String name){
        this.name = name;
        return this;
    }
}
