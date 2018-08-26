package mu.zz.axin.signinbuilderlib.Configurations.Registration;

import mu.zz.axin.signinbuilderlib.Configurations.Configuration;

public interface RegistrationConfiguration extends Configuration {
    RegistrationConfigurationBuilder autocomplete();
    RegistrationConfigurationBuilder necessarilyText(TextType type);
    RegistrationConfigurationBuilder validateText(TextType type);
    RegistrationConfigurationBuilder disableRegisterButton();


}
