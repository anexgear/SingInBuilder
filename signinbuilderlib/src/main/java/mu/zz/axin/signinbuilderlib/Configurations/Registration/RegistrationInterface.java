package mu.zz.axin.signinbuilderlib.Configurations.Registration;

import mu.zz.axin.signinbuilderlib.Configurations.Configuration;

public interface RegistrationInterface extends Configuration {
    RegistrationConfiguration autocomplete();
    RegistrationConfiguration necessarilyText(TextType type);
    RegistrationConfiguration validateText(TextType type);
    RegistrationConfiguration disableRegisterButton();


}
