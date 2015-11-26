package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.LoginCredentials;

public class CreateLoginCredentialsResult implements DomainCommandResult {

	private LoginCredentials loginCredentials;

	public CreateLoginCredentialsResult(LoginCredentials loginCredentials) {
		this.loginCredentials = loginCredentials;
	}

	public LoginCredentials getLoginCredentials() {
		return loginCredentials;
	}

}
