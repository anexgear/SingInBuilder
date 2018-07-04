package mu.zz.axin.signinbuilderlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import mu.zz.axin.signinbuilderlib.Fragments.SignInFragment;

public class SignInViewBuilder  implements SignInView {
    private String layoutIdString = Environment.SCREEN_LAYOUT_ID;
    private String signInFieldIdString = Environment.SCREEN_SIGN_IN_FIELD_ID;
    private String passwordFieldIdString = Environment.SCREEN_PASSWORD_FIELD_ID;
    private String signInButtonIdString = Environment.SCREEN_SIGN_IN_BUTTON_ID;
    private String registerButtonIdString = Environment.SCREEN_REGISTER_BUTTON_ID;
    private Bundle customButtons;
    private final Bundle args;

    public SignInViewBuilder() {
        args = new Bundle();
        customButtons = new Bundle();
    }

    @Override
    public SignInViewBuilder layout(int layoutId) {
        args.putInt(layoutIdString, layoutId);
        return this;
    }

    @Override
    public SignInViewBuilder signInField(int signInFieldId, SignInType signInType) {
        args.putInt(signInFieldIdString, signInFieldId);
        return this;
    }

    @Override
    public SignInViewBuilder passwordField(int passwordFieldId, PasswordStrength passwordStrength) {
        args.putInt(passwordFieldIdString, passwordFieldId);
        return this;
    }

    @Override
    public SignInViewBuilder signInButton(int signInButtonId) {
        args.putInt(signInButtonIdString, signInButtonId);
        return this;
    }

    @Override
    public SignInViewBuilder registerButton(int registerButtonId) {
        args.putInt(registerButtonIdString, registerButtonId);
        return this;
    }

    @Override
    public SignInViewBuilder customButton(int customButtonId, View.OnClickListener onClickListener) {
        return this;
    }

    @Override
    public Fragment build() {
        SignInFragment fragment = new SignInFragment();
        fragment.setArguments(args);
        return fragment;
    }
}