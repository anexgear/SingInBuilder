package mu.zz.axin.signinbuilderlib.Configurations.SignIn;

import mu.zz.axin.signinbuilderlib.Configurations.BaseConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.View.Screen;

public class SignInConfiguration extends BaseConfiguration implements SignInInterface {


    public SignInConfiguration(Screen screen) {
        initView(screen);
    }

    @Override
    public SignInInterface signInType(SignInType type) {
        return null;

    }

    @Override
    public SignInInterface validateSignIn() {
        return null;
    }

    @Override
    public SignInInterface validatePassword() {
        return null;
    }

    @Override
    public SignInInterface validateSignInAndPassword() {
        return null;
    }

    @Override
    public SignInInterface disableSignInButton() {
        return null;
    }

    @Override
    public Configuration configure() {
        return null;
    }
}
