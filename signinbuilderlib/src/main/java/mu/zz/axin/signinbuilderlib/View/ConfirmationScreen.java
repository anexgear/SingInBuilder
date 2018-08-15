package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;



class ConfirmationScreen extends ScreenView implements ConfirmationView {


    ConfirmationScreen(int layoutId) {
        args = new Bundle();
        args.putInt(layoutIdString, layoutId);
    }

    @Override
    public ConfirmationView confirmationEditText(int confirmationEditTextId) {
        editTextMap.put(confirmationETString,confirmationEditTextId);
        return this;
    }

    @Override
    public ConfirmationView confirmButton(int confirmButtonId) {
        textButtonMap.put(confirmButtonString, confirmButtonId);
        return this;
    }

    @Override
    public ConfirmationView backButton(int backButtonId) {
        textButtonMap.put(backButtonIdString, backButtonId);
        return this;
    }



}
