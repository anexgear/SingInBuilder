package mu.zz.axin.signinbuilderlib;
import android.support.v7.app.AppCompatActivity;



public class SignInBuilder implements ActivityHolder {
    private static final SignInBuilder INSTANCE = new SignInBuilder();

    public static SignInBuilder getInstance() {
        return INSTANCE;
    }

    private SignInBuilder() {
    }


    @Override
    public SignInBuilder bindToActivity(AppCompatActivity activity, int containerId) {
        return null;
    }

    @Override
    public SignInType setNavigationType(SignInType signInType) {
        return signInType;
    }

}
