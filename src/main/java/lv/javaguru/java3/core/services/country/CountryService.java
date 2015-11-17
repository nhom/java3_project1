package lv.javaguru.java3.core.services.country;

import lv.javaguru.java3.core.domain.Country;

/**
 * Created by Edgar on 10-Nov-15.
 */
public interface CountryService {
    Country update(Long countryId,
                            String newName,
                            String newCode,
                   int newPhoneCode);

    Country get(Long countryId);
}
