package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.domain.LoginCredentials;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.logincredentials.LoginCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class GetLoginCredentialsCommandHandler
        implements DomainCommandHandler<GetLoginCredentialsCommand, GetLoginCredentialsResult> {

    @Autowired
    private LoginCredentialsService loginCredentialsService;


    @Override
    public GetLoginCredentialsResult execute(GetLoginCredentialsCommand command) {
        LoginCredentials loginCredentials = loginCredentialsService.get(command.getClientId());
        return new GetLoginCredentialsResult(loginCredentials);
    }

    @Override
    public Class getCommandType() {
        return GetLoginCredentialsCommand.class;
    }

}
