package mu.zz.axin.singinbuilder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import mu.zz.axin.signinbuilderlib.Configurations.SignInConfiguration;
import mu.zz.axin.signinbuilderlib.Navigation;
import mu.zz.axin.signinbuilderlib.NavigationBuilder;
import mu.zz.axin.signinbuilderlib.View.ViewBuilder;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Fragment loginScreen = new SignInViewBuilder()
//                .layout(R.layout.sign_in_screen)
//                .signInEditText(R.id.signInEditText)
//                .passwordField(R.id.passwordEditText)
//                .signInButton(R.id.signInButton)
//                .registerButton(R.id.registerButton)
//                .build();

        Screen loginScreen = new ViewBuilder()
                .signInScreen(R.layout.sign_in_screen)
                .signInEditText(R.id.signInEditText)
                .passwordEditText(R.id.passwordEditText)
                .signInButton(R.id.signInButton)
                .registerButton(R.id.registerButton)
                .build();

        Screen registrationScreen = new ViewBuilder()
                .registrationScreen(R.layout.register_screen)
                .nameEditText(R.id.registrationNameTextView)
                .lastNameEditText(R.id.registrationLastNameTextView)
                .emailEditText(R.id.registrationEmailTextView)
                .phoneEditText(R.id.registrationPhoneTextView)
                .registerButton(R.id.registrationRegisterButton)
                .backButton(R.id.registrationBackButton)
                .build();

        Screen confirmationScreen = new ViewBuilder()
                .confirmationScreen(R.layout.confirm_screen)
                .confirmationEditText(R.id.confirmationConfirmEditText)
                .confirmButton(R.id.confirmationConfirmButton)
                .backButton(R.id.confirmationBackButton)
                .build();

        SignInConfiguration mSignInConfiguration = new SignInConfiguration(loginScreen)
                .configure();

        Navigation navigation = new NavigationBuilder()
                .loginScreen(loginScreen)
                .registrationScreen(registrationScreen)
                .confirmationScreen(confirmationScreen)
                .start();


//        getSupportFragmentManager().beginTransaction().replace(R.id.container, loginScreen).commit();
    }
}
