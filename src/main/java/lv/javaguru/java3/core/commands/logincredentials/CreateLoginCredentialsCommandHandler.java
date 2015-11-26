package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsCommand;
import lv.javaguru.java3.core.commands.logincredentials.CreateLoginCredentialsResult;
import lv.javaguru.java3.core.domain.LoginCredentials;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.logincredentials.LoginCredentialsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CreateLoginCredentialsCommandHandler
		implements DomainCommandHandler<CreateLoginCredentialsCommand, CreateLoginCredentialsResult> {

	@Autowired
	private LoginCredentialsFactory loginCredentialsFactory;

	@Override
	public CreateLoginCredentialsResult execute(CreateLoginCredentialsCommand command) {
		LoginCredentials loginCredentials = loginCredentialsFactory.create(
				command.getLogin(),
				command.getPassword()
		);
		return new CreateLoginCredentialsResult(loginCredentials);
	}

	@Override
	public Class getCommandType() {
		return CreateLoginCredentialsCommand.class;
	}
	
}
