package mu.zz.axin.signinbuilderlib.View.Registration;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.View.ScreenView;


public class RegistrationBuilder extends ScreenView implements RegistrationView {
    
    public RegistrationBuilder(int layoutId) {
        args = new Bundle();
        args.putInt(layoutIdString, layoutId);
    }

    @Override
    public RegistrationView nameEditText(int signInEditTextId) {
        args.putInt(nameEditTextIdString, signInEditTextId);
        return this;
    }

    @Override
    public RegistrationView lastNameEditText(int lastNameEditTextId) {
        args.putInt(lastNameEditTextIdString, lastNameEditTextId);
        return this;
    }

    @Override
    public RegistrationView loginEditText(int loginEditTextId) {
        args.putInt(loginEditTextIdString, loginEditTextId);
        return this;
    }

    @Override
    public RegistrationView emailEditText(int emailEditTextId) {
        args.putInt(emailEditTextIdString, emailEditTextId);
        return this;
    }

    @Override
    public RegistrationView phoneEditText(int phoneEditTextId) {
        args.putInt(phoneEditTextIdString, phoneEditTextId);
        return this;
    }

    @Override
    public RegistrationView registerButton(int registerButtonId) {
        args.putInt(registerButtonIdString, registerButtonId);
        return this;
    }

    @Override
    public RegistrationView backButton(int backButtonId) {
        args.putInt(backButtonIdString, backButtonId);
        return this;
    }


}
