package mu.zz.axin.signinbuilderlib.View.interfaces;

import android.support.annotation.IdRes;

public interface RegistrationView extends Builder {

    RegistrationView nameEditText(@IdRes int signInEditTextId);
    RegistrationView lastNameEditText(@IdRes int lastNameEditTextId);
    RegistrationView loginEditText(@IdRes int loginEditTextId);
    RegistrationView emailEditText(@IdRes int emailEditTextId);
    RegistrationView phoneEditText(@IdRes int phoneEditTextId);
    RegistrationView registerButton(@IdRes int registerButtonId);
    RegistrationView backButton(@IdRes int backButtonId);

}

