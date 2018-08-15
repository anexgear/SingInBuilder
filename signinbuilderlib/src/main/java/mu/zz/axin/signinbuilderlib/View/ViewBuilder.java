package mu.zz.axin.signinbuilderlib.View;

import android.support.annotation.LayoutRes;

public class ViewBuilder {

    public SignInView signInScreen(@LayoutRes int layoutId) {
        return new SignInScreen(layoutId);
    }

    public RegistrationView registrationScreen(@LayoutRes int layoutId) {
        return new RegisterScreen(layoutId);
    }

    public ConfirmationView confirmationScreen(@LayoutRes int layoutId) {
        return new ConfirmationScreen(layoutId);
    }

}
