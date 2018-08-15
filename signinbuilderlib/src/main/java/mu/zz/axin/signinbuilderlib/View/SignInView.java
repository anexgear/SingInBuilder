package mu.zz.axin.signinbuilderlib.View;

import android.support.annotation.IdRes;

public interface SignInView {

    SignInView signInEditText(@IdRes int signInEditTextId);
    SignInView passwordEditText(@IdRes int passwordEditTextId);
    SignInView signInButton(@IdRes int signInButtonId);
    SignInView registerButton(@IdRes int registerButtonId);
}
