package mu.zz.axin.signinbuilderlib;

import mu.zz.axin.signinbuilderlib.View.Screen;

public interface Navigation {
    Navigation loginScreen(Screen loginScreen);
    Navigation registrationScreen(Screen registrationScreen);
    Navigation confirmationScreen(Screen confirmationScreen);
    Navigation start();
}
