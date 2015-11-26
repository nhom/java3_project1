package lv.javaguru.java3.core.database.user.profile;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.user.Profile;
import org.springframework.stereotype.Component;

@Component
class ProfileDAOImpl extends CRUDOperationDAOImpl<Profile, Long> implements ProfileDAO {

}
