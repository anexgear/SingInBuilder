package mu.zz.axin.signinbuilderlib.Configurations;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.Environment;
import mu.zz.axin.signinbuilderlib.View.Screen;


public abstract class BaseConfiguration implements Configuration {

    protected Bundle configuration;
    protected String disableButtonString = Environment.DISABLE_BUTTON;
    protected String alphabeticString =  Environment.ALPHABETIC;
    protected String numericString = Environment.NUMERIC;
    protected String validateSignInString = Environment.VALIDATE_SIGN_IN;
    protected String validatePasswordString = Environment.VALIDATE_PASSWORD;
    protected boolean alphabetic = false;
    protected boolean numeric = false;
    protected boolean disableButton = false;


    protected void initView(Screen screen) {
        configuration = new Bundle();
        configuration.putAll(screen.getLayoutBundle());
    }



}
