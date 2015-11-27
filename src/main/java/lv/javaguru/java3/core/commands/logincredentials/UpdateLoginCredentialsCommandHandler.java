package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.logincredentials.UpdateLoginCredentialsCommand;
import lv.javaguru.java3.core.commands.logincredentials.UpdateLoginCredentialsResult;
import lv.javaguru.java3.core.domain.LoginCredentials;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.logincredentials.LoginCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UpdateLoginCredentialsCommandHandler
        implements DomainCommandHandler<UpdateLoginCredentialsCommand, UpdateLoginCredentialsResult> {

    @Autowired
    private LoginCredentialsService loginCredentialsService;


    @Override
    public UpdateLoginCredentialsResult execute(UpdateLoginCredentialsCommand command) {
        LoginCredentials loginCredentials = loginCredentialsService.update(
                command.getClientId(),
                command.getLogin(),
                command.getPassword()
        );
        return new UpdateLoginCredentialsResult(loginCredentials.getDTO());
    }

    @Override
    public Class getCommandType() {
        return UpdateLoginCredentialsCommand.class;
    }

}
