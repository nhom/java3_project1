package lv.javaguru.java3.core.commands.logincredentials;

import lv.javaguru.java3.core.commands.DomainCommand;

public class GetLoginCredentialsCommand implements DomainCommand<GetLoginCredentialsResult> {

    private Long clientId;

    public GetLoginCredentialsCommand(Long clientId) {
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

}
