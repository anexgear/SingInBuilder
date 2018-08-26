package mu.zz.axin.signinbuilderlib.Configurations.Confirmation;


import mu.zz.axin.signinbuilderlib.Configurations.Configuration;

public interface ConfirmationConfiguration extends Configuration {

    ConfirmationConfigurationBuilder setType(ConfirmationType type);
    ConfirmationConfigurationBuilder validate();
    ConfirmationConfigurationBuilder disableConfirmButton();

}
