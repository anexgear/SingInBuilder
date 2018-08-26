package mu.zz.axin.singinbuilder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.Configurations.Confirmation.ConfirmationConfigurationBuilder;
import mu.zz.axin.signinbuilderlib.Navigation;
import mu.zz.axin.signinbuilderlib.NavigationBuilder;
import mu.zz.axin.signinbuilderlib.View.Screen;
import mu.zz.axin.signinbuilderlib.View.ViewFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Screen signInScreen = new ViewFactory()
                .signInScreen(R.layout.sign_in_screen)
                .signInEditText(R.id.signInEditText)
                .passwordEditText(R.id.passwordEditText)
                .signInButton(R.id.signInButton)
                .registerButton(R.id.registerButton)
                .build();

        Screen registrationScreen = new ViewFactory()
                .registrationScreen(R.layout.register_screen)
                .nameEditText(R.id.registrationNameTextView)
                .lastNameEditText(R.id.registrationLastNameTextView)
                .emailEditText(R.id.registrationEmailTextView)
                .phoneEditText(R.id.registrationPhoneTextView)
                .registerButton(R.id.registrationRegisterButton)
                .backButton(R.id.registrationBackButton)
                .build();

        Screen confirmationScreen = new ViewFactory()
                .confirmationScreen(R.layout.confirm_screen)
                .confirmationEditText(R.id.confirmationConfirmEditText)
                .confirmButton(R.id.confirmationConfirmButton)
                .backButton(R.id.confirmationBackButton)
                .build();


        Configuration mSignInConfiguration;

        Configuration mRegistrationConfiguration;

        Configuration mConfirmationConfiguration = new ConfirmationConfigurationBuilder(signInScreen)
                .configure();

        Navigation navigation = new NavigationBuilder()
                .loginScreen(signInScreen)
                .registrationScreen(registrationScreen)
                .confirmationScreen(confirmationScreen)
                .start();


//        getSupportFragmentManager().beginTransaction().replace(R.id.container, signInScreen).commit();
    }
}
