package mu.zz.axin.signinbuilderlib.Configurations.SignIn;

import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.SignInType;

interface SignInInterface extends Configuration {

    SignInInterface signInType(SignInType type);
    SignInInterface validateSignIn();
    SignInInterface validatePassword();
    SignInInterface validateSignInAndPassword();
    SignInInterface disableSignInButton();


}
