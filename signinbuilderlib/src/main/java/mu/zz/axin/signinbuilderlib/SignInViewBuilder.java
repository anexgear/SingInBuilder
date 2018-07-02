package mu.zz.axin.signinbuilderlib;

import android.view.View;


public class SignInViewBuilder  implements SignInView{
    @Override
    public SignInViewBuilder signInField(int signInFieldId, SignInType signInType) {
        return null;
    }

    @Override
    public SignInViewBuilder passwordField(int signInFieldId, PasswordStrength passwordStrength) {
        return null;
    }

    @Override
    public SignInViewBuilder signInButton(int signInButtonId) {
        return null;
    }

    @Override
    public SignInViewBuilder registerButton(int registerButtonId) {
        return null;
    }

    @Override
    public SignInViewBuilder customButton(int customButtonId, View.OnClickListener onClickListener) {
        return null;
    }

    @Override
    public SignInViewBuilder build() {
        return null;
    }


}
