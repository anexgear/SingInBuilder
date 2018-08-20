package mu.zz.axin.signinbuilderlib.Configurations.Confirmation;




import mu.zz.axin.signinbuilderlib.Configurations.BaseConfiguration;
import mu.zz.axin.signinbuilderlib.Configurations.Configuration;
import mu.zz.axin.signinbuilderlib.Environment;
import mu.zz.axin.signinbuilderlib.View.Screen;


public class ConfirmationConfiguration extends BaseConfiguration implements ConfirmationInterface  {

    private String validateString = Environment.VALIDATE;
    private boolean validate = false;
    private ConfirmationType confirmationType;



    public ConfirmationConfiguration(Screen screen) {
        initView(screen);
    }


    @Override
    public ConfirmationConfiguration setType(ConfirmationType type) {
        this.confirmationType = type;
        return this;
    }

    @Override
    public ConfirmationConfiguration validate() {
        validate = true;
        return this;
    }

    @Override
    public ConfirmationConfiguration disableConfirmButton() {
        disableButton = true;
        return this;
    }

    @Override
    public Configuration configure() {
        switch (confirmationType){
            case ALPHABETIC:
                alphabetic = true;
                break;
            case NUMERIC:
                numeric = true;
                break;
            case ALPHANUMERIC:
                alphabetic = true;
                numeric = true;
                break;
            default:
                alphabetic = false;
                numeric = false;
                break;
        }

        configuration.putBoolean(validateString, validate);
        configuration.putBoolean(alphabeticString, alphabetic);
        configuration.putBoolean(numericString, numeric);
        configuration.putBoolean(disableButtonString,disableButton);
        return this;
    }

}
