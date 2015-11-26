package lv.javaguru.java3.core.services.logincredentials;

import lv.javaguru.java3.core.domain.user.LoginCredentials;


public interface LoginCredentialsService {

    LoginCredentials update(Long clientId,
                  String newLogin,
                  String newPassword);

    LoginCredentials get(Long clientId);

}
