package lv.javaguru.java3.core.commands.profile;

import lv.javaguru.java3.core.commands.DomainCommand;

/**
 * Created by User on 10.11.2015..
 */
public class GetProfileCommand implements DomainCommand<GetProfileResult> {

    private Long profileId;

    public GetProfileCommand(Long profileId) {
        this.profileId = profileId;
    }

    public Long getProfileId() {
        return profileId;
    }
}
