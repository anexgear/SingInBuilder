package mu.zz.axin.signinbuilderlib.View.interfaces;

import android.support.annotation.IdRes;

public interface SignInView extends Builder {

    SignInView signInEditText(@IdRes int signInEditTextId);
    SignInView passwordEditText(@IdRes int passwordEditTextId);
    SignInView signInButton(@IdRes int signInButtonId);
    SignInView registerButton(@IdRes int registerButtonId);

}
