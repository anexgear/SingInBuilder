package mu.zz.axin.signinbuilderlib.View;

import android.support.annotation.IdRes;


public interface ConfirmationView extends Screen{

    ConfirmationView confirmationEditText(@IdRes int confirmationEditTextId);
    ConfirmationView confirmButton(@IdRes int confirmButtonId);
    ConfirmationView backButton(@IdRes int backButtonId);


}
