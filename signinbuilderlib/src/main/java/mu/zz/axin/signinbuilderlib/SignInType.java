package mu.zz.axin.signinbuilderlib;

import android.support.annotation.IdRes;
import android.view.View;

public interface SignInType {

    SignInType setLogInView(@IdRes int logInViewId, SignInFieldsType signInFieldsType);
//        TODO: LoginView + ViewType

    SignInType setPasswordView(@IdRes int passwordViewId, PasswordStrength passwordStrength);
//        TODO: Password + PasswordStr

    SignInType setButtons(@IdRes int buttonViewId, View.OnClickListener onClickListener);
//        TODO: Add 1 ... N Buttons


}
