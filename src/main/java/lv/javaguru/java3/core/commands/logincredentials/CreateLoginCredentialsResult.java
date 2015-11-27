package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.LoginCredentials;
import lv.javaguru.java3.core.dto.logincredentials.LoginCredentialsDTO;

public class CreateLoginCredentialsResult implements DomainCommandResult {

	private LoginCredentialsDTO loginCredentials;

	public CreateLoginCredentialsResult(LoginCredentialsDTO loginCredentials) {
		this.loginCredentials = loginCredentials;
	}

	public LoginCredentialsDTO getLoginCredentials() {
		return loginCredentials;
	}

}
