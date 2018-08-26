package mu.zz.axin.signinbuilderlib.Configurations.SignIn;

import mu.zz.axin.signinbuilderlib.Configurations.BaseConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.SignInType;
import mu.zz.axin.signinbuilderlib.View.Screen;

public class SignInConfigurationBuilder extends BaseConfiguration implements SignInConfiguration {


    public SignInConfigurationBuilder(Screen screen) {
        initView(screen);
    }

    @Override
    public SignInConfiguration signInType(SignInType type) {
        return null;

    }

    @Override
    public SignInConfiguration validateSignIn() {
        return null;
    }

    @Override
    public SignInConfiguration validatePassword() {
        return null;
    }

    @Override
    public SignInConfiguration validateSignInAndPassword() {
        return null;
    }

    @Override
    public SignInConfiguration disableSignInButton() {
        return null;
    }

    @Override
    public Configuration configure() {
        return null;
    }
}
