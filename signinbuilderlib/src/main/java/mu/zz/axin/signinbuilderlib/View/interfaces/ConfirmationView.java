package mu.zz.axin.signinbuilderlib.View.interfaces;

import android.support.annotation.IdRes;


public interface ConfirmationView extends Builder {

    ConfirmationView confirmationEditText(@IdRes int confirmationEditTextId);
    ConfirmationView confirmButton(@IdRes int confirmButtonId);
    ConfirmationView backButton(@IdRes int backButtonId);


}
