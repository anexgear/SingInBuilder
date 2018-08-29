package mu.zz.axin.signinbuilderlib.Configurations.interfaces;

import mu.zz.axin.signinbuilderlib.SignInType;

public interface SignInConfiguration extends Configuration {

    SignInConfiguration signInType(SignInType type);
    SignInConfiguration validateSignIn();
    SignInConfiguration validatePassword();
    SignInConfiguration validateSignInAndPassword();
    SignInConfiguration disableSignInButton();


}
