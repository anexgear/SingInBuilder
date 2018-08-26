package mu.zz.axin.signinbuilderlib.View;

import android.support.annotation.LayoutRes;

import mu.zz.axin.signinbuilderlib.View.Confirmation.ConfirmationBuilder;
import mu.zz.axin.signinbuilderlib.View.Confirmation.ConfirmationView;
import mu.zz.axin.signinbuilderlib.View.Registration.RegistrationBuilder;
import mu.zz.axin.signinbuilderlib.View.Registration.RegistrationView;
import mu.zz.axin.signinbuilderlib.View.SignIn.SignInBuilder;
import mu.zz.axin.signinbuilderlib.View.SignIn.SignInView;

public class ViewFactory {

    public SignInView signInScreen(@LayoutRes int layoutId) {
        return new SignInBuilder(layoutId);
    }

    public RegistrationView registrationScreen(@LayoutRes int layoutId) {
        return new RegistrationBuilder(layoutId);
    }

    public ConfirmationView confirmationScreen(@LayoutRes int layoutId) {
        return new ConfirmationBuilder(layoutId);
    }

}
