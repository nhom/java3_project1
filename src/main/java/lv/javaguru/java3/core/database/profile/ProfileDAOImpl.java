package lv.javaguru.java3.core.database.profile;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.Profile;
import org.springframework.stereotype.Component;

@Component
class ProfileDAOImpl extends CRUDOperationDAOImpl<Profile, Long> implements ProfileDAO {

}
