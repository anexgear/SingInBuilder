package mu.zz.axin.singinbuilder;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import mu.zz.axin.signinbuilderlib.PasswordStrength;
import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.SignInViewBuilder;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment viewBuilder = new SignInViewBuilder()
                .layout(R.layout.sign_in_screen)
                .signInField(R.id.signInEditText, SignInType.EMAIL_SIGN_IN)
                .passwordField(R.id.passwordEditText, PasswordStrength.WEAK)
                .signInButton(R.id.signInButton)
                .registerButton(R.id.registerButton)
                .build();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, viewBuilder).commit();
    }
}
