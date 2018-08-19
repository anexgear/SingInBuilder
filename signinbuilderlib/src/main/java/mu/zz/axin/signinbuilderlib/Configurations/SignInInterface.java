package mu.zz.axin.signinbuilderlib.Configurations;

interface SignInInterface extends Configuration {

    SignInInterface byPhone();
    SignInInterface byEMail();
    SignInInterface byUserName();
    SignInInterface byUserNameOrEMail();
    SignInInterface byPhoneOrEMail();
    SignInInterface byUserNameOrPhone();
    SignInInterface validateSignIn();
    SignInInterface validatePassword();
    SignInInterface validateSignInAndPassword();


}
