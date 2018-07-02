package mu.zz.axin.signinbuilderlib;

import android.support.annotation.IdRes;
import android.view.View;


interface SignInView {
    SignInViewBuilder signInField(@IdRes int signInFieldId, SignInType signInType);
    SignInViewBuilder passwordField(@IdRes int signInFieldId, PasswordStrength passwordStrength);
    SignInViewBuilder signInButton(@IdRes int signInButtonId);
    SignInViewBuilder registerButton(@IdRes int registerButtonId);
    SignInViewBuilder customButton(@IdRes int customButtonId, View.OnClickListener onClickListener);
    SignInViewBuilder build();
}
