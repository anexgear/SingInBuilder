package mu.zz.axin.signinbuilderlib.View;

import android.support.annotation.LayoutRes;

import mu.zz.axin.signinbuilderlib.View.Confirmation.ConfirmationScreen;
import mu.zz.axin.signinbuilderlib.View.Confirmation.ConfirmationView;
import mu.zz.axin.signinbuilderlib.View.Registration.RegisterScreen;
import mu.zz.axin.signinbuilderlib.View.Registration.RegistrationView;
import mu.zz.axin.signinbuilderlib.View.SignIn.SignInScreen;
import mu.zz.axin.signinbuilderlib.View.SignIn.SignInView;

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
