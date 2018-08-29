package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import mu.zz.axin.signinbuilderlib.Environment;
import mu.zz.axin.signinbuilderlib.View.interfaces.ConfirmationView;
import mu.zz.axin.signinbuilderlib.View.interfaces.RegistrationView;
import mu.zz.axin.signinbuilderlib.View.interfaces.Screen;
import mu.zz.axin.signinbuilderlib.View.interfaces.SignInView;

public class ViewFactory {

    private String layoutIdString = Environment.SCREEN_LAYOUT_ID;
    private String confirmationETString = Environment.SCREEN_CONFIRMATION_ET_ID;
    private String signInEditTextIdString = Environment.SCREEN_SIGN_IN_ET_ID;
    private String passwordEditTextIdString = Environment.SCREEN_PASSWORD_ET_ID;
    private String nameEditTextIdString = Environment.SCREEN_NAME_ET_ID;
    private String lastNameEditTextIdString = Environment.SCREEN_LAST_NAME_ET_ID;
    private String loginEditTextIdString = Environment.SCREEN_LOGIN_ET_ID;
    private String emailEditTextIdString = Environment.SCREEN_EMAIL_ET_ID;
    private String phoneEditTextIdString = Environment.SCREEN_PHONE_ET_ID;
    private String signInButtonIdString = Environment.SCREEN_SIGN_IN_BUTTON_ID;
    private String registerButtonIdString = Environment.SCREEN_REGISTER_BUTTON_ID;
    private String confirmButtonString = Environment.SCREEN_CONFIRM_BUTTON_ID;
    private String backButtonIdString = Environment.SCREEN_BACK_BUTTON_ID;

    public SignInView signInScreen(@LayoutRes int layoutId) {
        return new SignInBuilder(layoutId);
    }

    public RegistrationView registrationScreen(@LayoutRes int layoutId) {
        return new RegistrationBuilder(layoutId);
    }

    public ConfirmationView confirmationScreen(@LayoutRes int layoutId) {
        return new ConfirmationBuilder(layoutId);
    }


    private class SignInBuilder extends BaseScreenView implements SignInView {


        SignInBuilder(int layoutId) {
            args = new Bundle();
            args.putInt(layoutIdString, layoutId);
        }

        @Override
        public SignInView signInEditText(int signInEditTextId) {
            args.putInt(signInEditTextIdString, signInEditTextId);
            return this;
        }

        @Override
        public SignInView passwordEditText(int passwordEditTextId) {
            args.putInt(passwordEditTextIdString, passwordEditTextId);
            return this;
        }

        @Override
        public SignInView signInButton(int signInButtonId) {
            args.putInt(signInButtonIdString, signInButtonId);
            return this;
        }

        @Override
        public SignInView registerButton(int registerButtonId) {
            args.putInt(registerButtonIdString, registerButtonId);
            return this;
        }

        @Override
        public Screen build() {
            return this;
        }
    }


    private class RegistrationBuilder extends BaseScreenView implements RegistrationView {

        RegistrationBuilder(int layoutId) {
            args = new Bundle();
            args.putInt(layoutIdString, layoutId);
        }

        @Override
        public RegistrationView nameEditText(int signInEditTextId) {
            args.putInt(nameEditTextIdString, signInEditTextId);
            return this;
        }

        @Override
        public RegistrationView lastNameEditText(int lastNameEditTextId) {
            args.putInt(lastNameEditTextIdString, lastNameEditTextId);
            return this;
        }

        @Override
        public RegistrationView loginEditText(int loginEditTextId) {
            args.putInt(loginEditTextIdString, loginEditTextId);
            return this;
        }

        @Override
        public RegistrationView emailEditText(int emailEditTextId) {
            args.putInt(emailEditTextIdString, emailEditTextId);
            return this;
        }

        @Override
        public RegistrationView phoneEditText(int phoneEditTextId) {
            args.putInt(phoneEditTextIdString, phoneEditTextId);
            return this;
        }

        @Override
        public RegistrationView registerButton(int registerButtonId) {
            args.putInt(registerButtonIdString, registerButtonId);
            return this;
        }

        @Override
        public RegistrationView backButton(int backButtonId) {
            args.putInt(backButtonIdString, backButtonId);
            return this;
        }


        @Override
        public Screen build() {
            return this;
        }
    }




    private class ConfirmationBuilder extends BaseScreenView implements ConfirmationView {


        ConfirmationBuilder(int layoutId) {
            args = new Bundle();
            args.putInt(layoutIdString, layoutId);
        }

        @Override
        public ConfirmationView confirmationEditText(int confirmationEditTextId) {
            args.putInt(confirmationETString,confirmationEditTextId);
            return this;
        }

        @Override
        public ConfirmationView confirmButton(int confirmButtonId) {
            args.putInt(confirmButtonString, confirmButtonId);
            return this;
        }

        @Override
        public ConfirmationView backButton(int backButtonId) {
            args.putInt(backButtonIdString, backButtonId);
            return this;
        }


        @Override
        public Screen build() {
            return this;
        }
    }








}
