package mu.zz.axin.signinbuilderlib.Configurations.SignIn;

import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.SignInType;

public interface SignInConfiguration extends Configuration {

    SignInConfiguration signInType(SignInType type);
    SignInConfiguration validateSignIn();
    SignInConfiguration validatePassword();
    SignInConfiguration validateSignInAndPassword();
    SignInConfiguration disableSignInButton();


}
