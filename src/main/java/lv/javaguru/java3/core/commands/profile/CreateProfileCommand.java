package lv.javaguru.java3.core.commands.profile;

import lv.javaguru.java3.core.commands.DomainCommand;

/**
 * Created by User on 10.11.2015..
 */
public class CreateProfileCommand implements DomainCommand<CreateProfileResult> {

    private String code;
    private String code3;
    private int phoneCode;
    private String name;

    public CreateProfileCommand(String code, String code3, int phoneCode, String name) {
        this.code = code;
        this.code3 = code3;
        this.phoneCode = phoneCode;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getCode3() {
        return code3;
    }

    public int getPhoneCode() { return phoneCode; }

    public String getName() { return name; }
}
