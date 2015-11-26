package lv.javaguru.java3.core.database.user.logincredentials;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.user.LoginCredentials;
import org.springframework.stereotype.Component;

@Component
class LoginCredentialsDAOImpl extends CRUDOperationDAOImpl<LoginCredentials, Long> implements LoginCredentialsDAO {

}
