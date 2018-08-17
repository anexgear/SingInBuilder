package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

class SignInScreen extends ScreenView implements SignInView {


    SignInScreen(int layoutId) {
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
