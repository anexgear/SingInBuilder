package mu.zz.axin.signinbuilderlib.Configurations;

import mu.zz.axin.signinbuilderlib.Configurations.Confirmation.ConfirmationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Confirmation.ConfirmationConfigurationBuilder;
import mu.zz.axin.signinbuilderlib.Configurations.Registration.RegistrationConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Registration.RegistrationConfigurationBuilder;
import mu.zz.axin.signinbuilderlib.Configurations.SignIn.SignInConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.SignIn.SignInConfigurationBuilder;
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
}
