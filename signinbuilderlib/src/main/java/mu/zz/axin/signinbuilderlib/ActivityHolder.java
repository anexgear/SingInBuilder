package mu.zz.axin.signinbuilderlib;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public interface ActivityHolder {

    SignInBuilder bindToActivity(AppCompatActivity activity);
//        TODO: Link Activity

    SignInBuilder setToolbar(Toolbar toolbar) ;
//        TODO: Set Toolbar ID or 0;

    SignInType setNavigationType(SignInType signInType);
//        TODO: Tabbed(Log in | Registrations) or Single Screen or Pre Log In

}
