package mu.zz.axin.signinbuilderlib.View.Confirmation;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.View.ScreenView;


public class ConfirmationScreen extends ScreenView implements ConfirmationView {


    public ConfirmationScreen(int layoutId) {
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
