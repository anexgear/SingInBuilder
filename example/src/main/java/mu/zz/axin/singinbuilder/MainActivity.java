package mu.zz.axin.singinbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mu.zz.axin.signinbuilderlib.PasswordStrength;
import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.SignInViewBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignInViewBuilder viewBuilder = new SignInViewBuilder()
                .signInField(R.id.signInEditText, SignInType.EMAIL_SIGN_IN)
                .passwordField(R.id.passwordEditText, PasswordStrength.WEAK)
                .signInButton(R.id.signInButton)
                .registerButton(R.id.registerButton)
                .customButton(R.id.customButton, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                })
                .build();
    }
}
