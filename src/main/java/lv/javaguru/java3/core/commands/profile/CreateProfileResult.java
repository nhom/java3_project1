package lv.javaguru.java3.core.commands.profile;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.user.Profile;

/**
 * Created by User on 10.11.2015..
 */
public class CreateProfileResult implements DomainCommandResult{
    private Profile profile;

    public CreateProfileResult(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }
}
