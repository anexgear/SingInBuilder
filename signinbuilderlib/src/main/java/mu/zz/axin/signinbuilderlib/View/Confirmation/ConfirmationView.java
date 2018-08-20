package mu.zz.axin.signinbuilderlib.View.Confirmation;

import android.support.annotation.IdRes;

import mu.zz.axin.signinbuilderlib.View.Screen;


public interface ConfirmationView extends Screen {

    ConfirmationView confirmationEditText(@IdRes int confirmationEditTextId);
    ConfirmationView confirmButton(@IdRes int confirmButtonId);
    ConfirmationView backButton(@IdRes int backButtonId);


}
