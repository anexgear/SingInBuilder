package mu.zz.axin.signinbuilderlib.View.SignIn;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.View.ScreenView;

public class SignInScreen extends ScreenView implements SignInView {


    public SignInScreen(int layoutId) {
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


}
