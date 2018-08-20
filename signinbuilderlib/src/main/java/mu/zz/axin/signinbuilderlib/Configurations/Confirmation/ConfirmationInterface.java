package mu.zz.axin.signinbuilderlib.Configurations.Confirmation;


import mu.zz.axin.signinbuilderlib.Configurations.Configuration;

public interface ConfirmationInterface extends Configuration {

    ConfirmationConfiguration setType(ConfirmationType type);
    ConfirmationConfiguration validate();
    ConfirmationConfiguration disableConfirmButton();

}
