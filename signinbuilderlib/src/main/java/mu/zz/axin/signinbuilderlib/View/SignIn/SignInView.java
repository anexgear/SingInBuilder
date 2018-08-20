package mu.zz.axin.signinbuilderlib.View.SignIn;

import android.support.annotation.IdRes;

import mu.zz.axin.signinbuilderlib.View.Screen;

public interface SignInView extends Screen {

    SignInView signInEditText(@IdRes int signInEditTextId);
    SignInView passwordEditText(@IdRes int passwordEditTextId);
    SignInView signInButton(@IdRes int signInButtonId);
    SignInView registerButton(@IdRes int registerButtonId);

}
