package mu.zz.axin.signinbuilderlib.Configurations;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.Configurations.interfaces.Configuration;
import mu.zz.axin.signinbuilderlib.View.interfaces.Screen;


public abstract class BaseConfiguration implements Configuration {

    protected Bundle configuration;
    boolean alphabetic = false;
    boolean numeric = false;
    boolean disableButton = false;


    void initView(Screen screen) {
        configuration = new Bundle();
        configuration.putAll(screen.getLayoutBundle());
    }



}
