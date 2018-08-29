package mu.zz.axin.signinbuilderlib;

import mu.zz.axin.signinbuilderlib.Configurations.interfaces.Configuration;


public interface Navigation {
    Navigation loginScreen(Configuration loginScreen);
    Navigation registrationScreen(Configuration registrationScreen);
    Navigation confirmationScreen(Configuration confirmationScreen);
    Navigation start();
}
