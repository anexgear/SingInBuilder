package mu.zz.axin.signinbuilderlib.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import mu.zz.axin.signinbuilderlib.Environment;

public class SignInFragment extends Fragment {
    EditText signInField, passwordField;
    Button signInButton, registerButton;
    String layoutIdString = Environment.SCREEN_LAYOUT_ID;
    String signInFieldIdString = Environment.SCREEN_SIGN_IN_FIELD_ID;
    String passwordFieldIdString = Environment.SCREEN_PASSWORD_FIELD_ID;
    String signInButtonIdString = Environment.SCREEN_SIGN_IN_BUTTON_ID;
    String registerButtonIdString = Environment.SCREEN_REGISTER_BUTTON_ID;
    Bundle args;


    public SignInFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        args = this.getArguments();
        View view = inflater.inflate(args.getInt(layoutIdString), container, false);
        signInField = view.findViewById(args.getInt(signInFieldIdString));
        passwordField = view.findViewById(args.getInt(passwordFieldIdString));
        signInButton = view.findViewById(args.getInt(signInButtonIdString));
        registerButton = view.findViewById(args.getInt(registerButtonIdString));
        return view;
    }

}
