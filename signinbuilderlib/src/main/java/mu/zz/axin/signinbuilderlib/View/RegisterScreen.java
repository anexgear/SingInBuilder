package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;


class RegisterScreen extends ScreenView implements RegistrationView {
    
    RegisterScreen(int layoutId) {
        args = new Bundle();
        args.putInt(layoutIdString, layoutId);
    }

    @Override
    public RegistrationView nameEditText(int signInEditTextId) {
        editTextMap.put(nameEditTextIdString, signInEditTextId);
        return this;
    }

    @Override
    public RegistrationView lastNameEditText(int lastNameEditTextId) {
        editTextMap.put(lastNameEditTextIdString, lastNameEditTextId);
        return this;
    }

    @Override
    public RegistrationView loginEditText(int loginEditTextId) {
        editTextMap.put(loginEditTextIdString, loginEditTextId);
        return this;
    }

    @Override
    public RegistrationView emailEditText(int emailEditTextId) {
        editTextMap.put(emailEditTextIdString, emailEditTextId);
        return this;
    }

    @Override
    public RegistrationView phoneEditText(int phoneEditTextId) {
        editTextMap.put(phoneEditTextIdString, phoneEditTextId);
        return this;
    }

    @Override
    public RegistrationView registerButton(int registerButtonId) {
        textButtonMap.put(registerButtonIdString, registerButtonId);
        return this;
    }

    @Override
    public RegistrationView backButton(int backButtonId) {
        textButtonMap.put(backButtonIdString, backButtonId);
        return this;
    }


}
