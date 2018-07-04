package mu.zz.axin.signinbuilderlib;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.View;

import mu.zz.axin.signinbuilderlib.Fragments.SignInFragment;


public interface SignInView {
    SignInViewBuilder layout(@LayoutRes int layoutId);
    SignInViewBuilder signInField(@IdRes int signInFieldId, SignInType signInType);
    SignInViewBuilder passwordField(@IdRes int signInFieldId, PasswordStrength passwordStrength);
    SignInViewBuilder signInButton(@IdRes int signInButtonId);
    SignInViewBuilder registerButton(@IdRes int registerButtonId);
    SignInViewBuilder customButton(@IdRes int customButtonId, View.OnClickListener onClickListener);
    Fragment build();
}
