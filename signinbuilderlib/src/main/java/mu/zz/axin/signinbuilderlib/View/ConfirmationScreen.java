package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;



class ConfirmationScreen extends ScreenView implements ConfirmationView {


    ConfirmationScreen(int layoutId) {
        args = new Bundle();
        args.putInt(layoutIdString, layoutId);
    }

    @Override
    public ConfirmationView confirmationEditText(int confirmationEditTextId) {
        args.putInt(confirmationETString,confirmationEditTextId);
        return this;
    }

    @Override
    public ConfirmationView confirmButton(int confirmButtonId) {
        args.putInt(confirmButtonString, confirmButtonId);
        return this;
    }

    @Override
    public ConfirmationView backButton(int backButtonId) {
        args.putInt(backButtonIdString, backButtonId);
        return this;
    }



}
