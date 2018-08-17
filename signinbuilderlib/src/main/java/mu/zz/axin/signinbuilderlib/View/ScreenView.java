package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.Environment;

abstract class ScreenView implements Screen  {

    String layoutIdString = Environment.SCREEN_LAYOUT_ID;
    String confirmationETString = Environment.SCREEN_CONFIRMATION_ET_ID;
    String signInEditTextIdString = Environment.SCREEN_SIGN_IN_ET_ID;
    String passwordEditTextIdString = Environment.SCREEN_PASSWORD_ET_ID;
    String nameEditTextIdString = Environment.SCREEN_NAME_ET_ID;
    String lastNameEditTextIdString = Environment.SCREEN_LAST_NAME_ET_ID;
    String loginEditTextIdString = Environment.SCREEN_LOGIN_ET_ID;
    String emailEditTextIdString = Environment.SCREEN_EMAIL_ET_ID;
    String phoneEditTextIdString = Environment.SCREEN_PHONE_ET_ID;
    String signInButtonIdString = Environment.SCREEN_SIGN_IN_BUTTON_ID;
    String registerButtonIdString = Environment.SCREEN_REGISTER_BUTTON_ID;
    String confirmButtonString = Environment.SCREEN_CONFIRM_BUTTON_ID;
    String backButtonIdString = Environment.SCREEN_BACK_BUTTON_ID;

    Bundle args;


    @Override
    public ScreenView build() {
        return this;
    }

    @Override
    public Bundle getLayoutBundle() {
        return args;
    }

    @Override
    public int getLayoutId() {
        return args.getInt(layoutIdString);
    }

    @Override
    public int getEditTextId(String textViewIdString) {
        return args.getInt(textViewIdString);
    }

    @Override
    public int getButtonId(String buttonIdString) {
        return args.getInt(buttonIdString);
    }




}
