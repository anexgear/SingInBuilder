package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

class SignInScreen extends ScreenView implements SignInView {


    SignInScreen(int layoutId) {
        args = new Bundle();
        args.putInt(layoutIdString, layoutId);
    }

    @Override
    public SignInView signInEditText(int signInEditTextId) {
        editTextMap.put(signInEditTextIdString, signInEditTextId);
        return this;
    }

    @Override
    public SignInView passwordEditText(int passwordEditTextId) {
        editTextMap.put(passwordEditTextIdString, passwordEditTextId);
        return this;
    }

    @Override
    public SignInView signInButton(int signInButtonId) {
        textButtonMap.put(signInButtonIdString, signInButtonId);
        return this;
    }

    @Override
    public SignInView registerButton(int registerButtonId) {
        textButtonMap.put(registerButtonIdString, registerButtonId);
        return this;
    }



}
