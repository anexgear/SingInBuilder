package mu.zz.axin.signinbuilderlib.Configurations;

import mu.zz.axin.signinbuilderlib.Configurations.Confirmation.ConfirmationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Confirmation.ConfirmationConfigurationBuilder;
import mu.zz.axin.signinbuilderlib.Configurations.Registration.RegistrationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Registration.RegistrationConfigurationBuilder;
import mu.zz.axin.signinbuilderlib.Configurations.SignIn.SignInConfiguration;

import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.View.Screen;

public class ConfigurationFactory {

    public SignInConfiguration signInScreen(Screen screen) {
        return new SignInConfigurationBuilder(screen);
    }

    public RegistrationConfiguration registrationScreen(Screen screen) {
        return new RegistrationConfigurationBuilder(screen);
    }

    public ConfirmationConfiguration confirmationScreen(Screen screen) {
        return new ConfirmationConfigurationBuilder(screen);
    }



    public class SignInConfigurationBuilder extends BaseConfiguration implements SignInConfiguration {
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
}
