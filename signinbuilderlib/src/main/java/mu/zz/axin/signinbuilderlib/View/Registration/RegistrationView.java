package mu.zz.axin.signinbuilderlib.View.Registration;

import android.support.annotation.IdRes;

import mu.zz.axin.signinbuilderlib.View.Screen;

public interface RegistrationView extends Screen {

    RegistrationView nameEditText(@IdRes int signInEditTextId);
    RegistrationView lastNameEditText(@IdRes int lastNameEditTextId);
    RegistrationView loginEditText(@IdRes int loginEditTextId);
    RegistrationView emailEditText(@IdRes int emailEditTextId);
    RegistrationView phoneEditText(@IdRes int phoneEditTextId);
    RegistrationView registerButton(@IdRes int registerButtonId);
    RegistrationView backButton(@IdRes int backButtonId);

}

