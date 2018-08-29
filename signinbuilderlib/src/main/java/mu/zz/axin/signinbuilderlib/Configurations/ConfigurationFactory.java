package mu.zz.axin.signinbuilderlib.Configurations;

import mu.zz.axin.signinbuilderlib.Configurations.interfaces.Configuration;
import mu.zz.axin.signinbuilderlib.Configurations.interfaces.ConfirmationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.interfaces.RegistrationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.interfaces.SignInConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.enums.ConfirmationType;
import mu.zz.axin.signinbuilderlib.Configurations.enums.NecessaryTextType;
import mu.zz.axin.signinbuilderlib.Environment;
import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.View.interfaces.Screen;

public class ConfigurationFactory {

    private String autocompleteString = Environment.AUTOCOMPLETE;
    private String necessarilyPhoneString = Environment.NECESSARILY_PHONE;
    private String necessarilyEmailString = Environment.NECESSARILY_EMAIL;
    private String necessarilyPasswordString = Environment.NECESSARILY_PASSWORD;
    private String validatePhoneString = Environment.VALIDATE_PHONE;
    private String validateEmailString = Environment.VALIDATE_EMAIL;
    private String validatePasswordString = Environment.VALIDATE_PASSWORD;
    private String validateString = Environment.VALIDATE;
    private String disableButtonString = Environment.DISABLE_BUTTON;
    private String alphabeticString =  Environment.ALPHABETIC;
    private String numericString = Environment.NUMERIC;
    private String validateSignInString = Environment.VALIDATE_SIGN_IN;


    public SignInConfiguration signInScreen(Screen screen) {
        return new SignInConfigurationBuilder(screen);
    }

    public RegistrationConfiguration registrationScreen(Screen screen) {
        return new RegistrationConfigurationBuilder(screen);
    }

    public ConfirmationConfiguration confirmationScreen(Screen screen) {
        return new ConfirmationConfigurationBuilder(screen);
    }


    private class SignInConfigurationBuilder extends BaseConfiguration implements SignInConfiguration {
        SignInType mType;

        SignInConfigurationBuilder(Screen screen) {
            initView(screen);
        }

        @Override
        public SignInConfiguration signInType(SignInType type) {
            this.mType = type;
            return this;
        }

        @Override
        public SignInConfiguration validateSignIn() {
            configuration.putBoolean(validateSignInString, true);
            return this;
        }

        @Override
        public SignInConfiguration validatePassword() {
            configuration.putBoolean(validatePasswordString, true);
            return this;
        }

        @Override
        public SignInConfiguration validateSignInAndPassword() {
            configuration.putBoolean(validateSignInString, true);
            configuration.putBoolean(validatePasswordString, true);
            return this;
        }

        @Override
        public SignInConfiguration disableSignInButton() {
            configuration.putBoolean(disableButtonString, true);
            return this;
        }

        @Override
        public Configuration configure() {
            return this;
        }
    }

    private class RegistrationConfigurationBuilder extends BaseConfiguration implements RegistrationConfiguration {

        private NecessaryTextType necessarily, validate;

        private boolean autocomplete = false;
        private boolean necessarilyPhone = false;
        private boolean necessarilyEmail = false;
        private boolean necessarilyPassword = false;
        private boolean validatePhone = false;
        private boolean validateEmail = false;
        private boolean validatePassword = false;

        RegistrationConfigurationBuilder(Screen screen) {
            initView(screen);
        }

        @Override
        public RegistrationConfigurationBuilder autocomplete() {
            autocomplete = true;
            return this;
        }

        @Override
        public RegistrationConfigurationBuilder necessarilyText(NecessaryTextType type) {
            this.necessarily = type;
            return this;
        }

        @Override
        public RegistrationConfigurationBuilder validateText(NecessaryTextType type) {
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



    private class ConfirmationConfigurationBuilder extends BaseConfiguration implements ConfirmationConfiguration {

        private boolean validate = false;
        private ConfirmationType confirmationType;


        ConfirmationConfigurationBuilder(Screen screen) {
            initView(screen);
        }


        @Override
        public ConfirmationConfigurationBuilder setType(ConfirmationType type) {
            this.confirmationType = type;
            return this;
        }

        @Override
        public ConfirmationConfigurationBuilder validate() {
            validate = true;
            return this;
        }

        @Override
        public ConfirmationConfigurationBuilder disableConfirmButton() {
            disableButton = true;
            return this;
        }

        @Override
        public Configuration configure() {
            switch (confirmationType){
                case ALPHABETIC:
                    alphabetic = true;
                    break;
                case NUMERIC:
                    numeric = true;
                    break;
                case ALPHANUMERIC:
                    alphabetic = true;
                    numeric = true;
                    break;
                default:
                    alphabetic = false;
                    numeric = false;
                    break;
            }

            configuration.putBoolean(validateString, validate);
            configuration.putBoolean(alphabeticString, alphabetic);
            configuration.putBoolean(numericString, numeric);
            configuration.putBoolean(disableButtonString,disableButton);
            return this;
        }

    }

}
