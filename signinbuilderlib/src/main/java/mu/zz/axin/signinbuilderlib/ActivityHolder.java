package mu.zz.axin.signinbuilderlib;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;


public interface ActivityHolder {

    SignInBuilder bindToActivity(AppCompatActivity activity, @IdRes int containerId);
//        TODO: Link Activity


    SignInType setNavigationType(SignInType signInType);
//        TODO: Tabbed(Log in | Registrations) or Single Screen or Pre Log In

}
