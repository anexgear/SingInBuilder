package mu.zz.axin.signinbuilderlib.Configurations.interfaces;


import mu.zz.axin.signinbuilderlib.Configurations.enums.NecessaryTextType;

public interface RegistrationConfiguration extends Configuration {
    RegistrationConfiguration autocomplete();
    RegistrationConfiguration necessarilyText(NecessaryTextType type);
    RegistrationConfiguration validateText(NecessaryTextType type);
    RegistrationConfiguration disableRegisterButton();


}
