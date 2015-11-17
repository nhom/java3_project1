package lv.javaguru.java3.core.services.country;

/**
 * Created by Edgar on 10-Nov-15.
 */
public interface CountryValidator {
    void validate(String name, String countryCode, int phoneCode);
}
