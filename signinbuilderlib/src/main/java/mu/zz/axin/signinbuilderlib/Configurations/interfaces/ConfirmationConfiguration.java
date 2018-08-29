package mu.zz.axin.signinbuilderlib.Configurations.interfaces;


import mu.zz.axin.signinbuilderlib.Configurations.enums.ConfirmationType;

public interface ConfirmationConfiguration extends Configuration {

    ConfirmationConfiguration setType(ConfirmationType type);
    ConfirmationConfiguration validate();
    ConfirmationConfiguration disableConfirmButton();

}
