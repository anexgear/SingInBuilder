package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.Environment;

public abstract class ScreenView implements Screen  {

    protected String layoutIdString = Environment.SCREEN_LAYOUT_ID;
    protected String confirmationETString = Environment.SCREEN_CONFIRMATION_ET_ID;
    protected String signInEditTextIdString = Environment.SCREEN_SIGN_IN_ET_ID;
    protected String passwordEditTextIdString = Environment.SCREEN_PASSWORD_ET_ID;
    protected String nameEditTextIdString = Environment.SCREEN_NAME_ET_ID;
    protected String lastNameEditTextIdString = Environment.SCREEN_LAST_NAME_ET_ID;
    protected String loginEditTextIdString = Environment.SCREEN_LOGIN_ET_ID;
    protected String emailEditTextIdString = Environment.SCREEN_EMAIL_ET_ID;
    protected String phoneEditTextIdString = Environment.SCREEN_PHONE_ET_ID;
    protected String signInButtonIdString = Environment.SCREEN_SIGN_IN_BUTTON_ID;
    protected String registerButtonIdString = Environment.SCREEN_REGISTER_BUTTON_ID;
    protected String confirmButtonString = Environment.SCREEN_CONFIRM_BUTTON_ID;
    protected String backButtonIdString = Environment.SCREEN_BACK_BUTTON_ID;

    protected Bundle args;


    @Override
    public ScreenView build() {
        return this;
    }

    @Override
    public Bundle getLayoutBundle() {
        return args;
    }



}
