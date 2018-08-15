package mu.zz.axin.signinbuilderlib;

public interface Navigation {
    Navigation loginScreen(Screen loginScreen);
    Navigation registrationScreen(Screen registrationScreen);
    Navigation confirmationScreen(Screen confirmationScreen);
    Navigation start();
}
