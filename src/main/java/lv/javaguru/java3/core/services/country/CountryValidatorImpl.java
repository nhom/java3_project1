package lv.javaguru.java3.core.services.country;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.apache.commons.lang.StringUtils.isBlank;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class CountryValidatorImpl implements CountryValidator{

    @Override
    public void validate(String name, String countryCode, int phoneCode) {
        validateName(name);
        validateCountryCode(countryCode);
        validatePhoneCode(phoneCode);
    }

    private void validateName(String name) {
        checkNotNull(name, "Country name must not be null");
        checkArgument(!isBlank(name), "Country name must not be empty");
    }

    private void validateCountryCode(String countryCode) {
        checkNotNull(countryCode, "Country code must not be null");
        checkArgument(!isBlank(countryCode), "Country code must not be empty");
    }

    private void validatePhoneCode(int phoneCode) {
        checkNotNull(phoneCode, "Country phone code must not be null");
    }
}
