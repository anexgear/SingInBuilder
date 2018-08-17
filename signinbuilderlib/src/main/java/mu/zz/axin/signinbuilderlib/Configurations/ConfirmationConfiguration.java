package mu.zz.axin.signinbuilderlib.Configurations;




import mu.zz.axin.signinbuilderlib.View.Screen;


public class ConfirmationConfiguration extends BaseConfiguration implements ConfirmationInterface  {


    public ConfirmationConfiguration(Screen screen) {
        initView(screen);
    }

    @Override
    public ConfirmationConfiguration alphabetic() {
        alphabetic = true;
        return this;
    }

    @Override
    public ConfirmationConfiguration numeric() {
        numeric = true;
        return this;
    }

    @Override
    public ConfirmationConfiguration alphanumeric() {
        numeric = true;
        alphabetic = true;
        return this;
    }

    @Override
    public Configuration configure() {
        configuration.putBoolean(alphabeticString, alphabetic);
        configuration.putBoolean(numericString, numeric);
        return this;
    }



}
