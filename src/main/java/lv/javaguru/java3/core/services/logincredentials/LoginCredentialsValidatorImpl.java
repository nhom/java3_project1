package lv.javaguru.java3.core.services.logincredentials;

import org.springframework.stereotype.Component;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.apache.commons.lang.StringUtils.isBlank;

@Component
class LoginCredentialsValidatorImpl implements LoginCredentialsValidator {

    @Override
    public void validate(String login, String password) {
        validateLogin(login);
        validatePassword(password);
    }

    private void validateLogin(String login) {
        checkNotNull(login, "LoginCredentials login must not be null");
        checkArgument(!isBlank(login), "LoginCredentials login must not be empty");
    }

    private void validatePassword(String password) {
        checkNotNull(password, "LoginCredentials password must not be null");
        checkArgument(!isBlank(password), "LoginCredentials password must not be empty");
    }

}
