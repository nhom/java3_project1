package lv.javaguru.java3.core.database.location.country;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.location.country.CountryDAO;
import lv.javaguru.java3.core.domain.loaction.Country;
import org.springframework.stereotype.Component;

@Component
class CountryDAOImpl extends CRUDOperationDAOImpl<Country, Long> implements CountryDAO {

}