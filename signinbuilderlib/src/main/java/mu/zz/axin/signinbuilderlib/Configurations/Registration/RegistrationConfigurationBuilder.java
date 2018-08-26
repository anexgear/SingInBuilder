package mu.zz.axin.signinbuilderlib.Configurations.Registration;

import mu.zz.axin.signinbuilderlib.Configurations.BaseConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.Environment;
import mu.zz.axin.signinbuilderlib.View.Screen;

public class RegistrationConfigurationBuilder extends BaseConfiguration implements RegistrationConfiguration {

    private TextType necessarily, validate;

    private String autocompleteString = Environment.AUTOCOMPLETE;
    private String necessarilyPhoneString = Environment.NECESSARILY_PHONE;
    private String necessarilyEmailString = Environment.NECESSARILY_EMAIL;
    private String necessarilyPasswordString = Environment.NECESSARILY_PASSWORD;
    private String validatePhoneString = Environment.VALIDATE_PHONE;
    private String validateEmailString = Environment.VALIDATE_EMAIL;
    private String validatePasswordString = Environment.VALIDATE_PASSWORD;
    private boolean autocomplete = false;
    private boolean necessarilyPhone = false;
    private boolean necessarilyEmail = false;
    private boolean necessarilyPassword = false;
    private boolean validatePhone = false;
    private boolean validateEmail = false;
    private boolean validatePassword = false;

    public RegistrationConfigurationBuilder(Screen screen) {
        initView(screen);
    }

    @Override
    public RegistrationConfigurationBuilder autocomplete() {
        autocomplete = true;
        return this;
    }

    @Override
    public RegistrationConfigurationBuilder necessarilyText(TextType type) {
        this.necessarily = type;
        return this;
    }

    @Override
    public RegistrationConfigurationBuilder validateText(TextType type) {
        this.validate = type;
        return this;
    }

    @Override
    public RegistrationConfigurationBuilder disableRegisterButton() {
        disableButton = true;
        return this;
    }


    @Override
    public Configuration configure() {
        necessarily();
        validate();
        configuration.putBoolean(autocompleteString,autocomplete);
        configuration.putBoolean(necessarilyPhoneString,necessarilyPhone);
        configuration.putBoolean(necessarilyEmailString,necessarilyEmail);
        configuration.putBoolean(necessarilyPasswordString,necessarilyPassword);
        configuration.putBoolean(validatePhoneString,validatePhone);
        configuration.putBoolean(validateEmailString,validateEmail);
        configuration.putBoolean(validatePasswordString,validatePassword);
        configuration.putBoolean(disableButtonString,disableButton);
        return this;
    }


    private void validate() {
        switch (validate) {
            case ALL:
                validatePhone = true;
                validateEmail = true;
                validatePassword = true;
                break;
            case PHONE:
                validatePhone = true;
                break;
            case EMAIL:
                validateEmail = true;
                break;
            case PASSWORD:
                validatePassword = true;
                break;
            default:
                validatePhone = false;
                validateEmail = false;
                validatePassword = false;
                break;
        }
    }

    private void necessarily() {
        switch (necessarily){
            case ALL:
                necessarilyPhone = true;
                necessarilyEmail = true;
                necessarilyPassword = true;
                break;
            case EMAIL:
                necessarilyEmail = true;
                break;
            case PHONE:
                necessarilyPhone = true;
                break;
            case PASSWORD:
                necessarilyPassword = true;
                break;
            default:
                necessarilyPhone = false;
                necessarilyEmail = false;
                necessarilyPassword = false;
                break;
        }
    }
}
