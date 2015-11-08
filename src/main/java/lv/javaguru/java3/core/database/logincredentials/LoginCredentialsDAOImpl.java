package lv.javaguru.java3.core.database.logincredentials;

import lv.javaguru.java3.core.database.LoginCredentialsDAO;
import lv.javaguru.java3.core.domain.LoginCredentials;
import org.springframework.stereotype.Component;

@Component
class LoginCredentialsDAOImpl extends CRUDOperationDAOImpl<LoginCredentials, Long> implements LoginCredentialsDAO {

}
