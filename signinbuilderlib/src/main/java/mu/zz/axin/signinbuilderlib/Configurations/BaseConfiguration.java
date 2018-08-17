package mu.zz.axin.signinbuilderlib.Configurations;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.View.Screen;


abstract class BaseConfiguration implements Configuration {

    Bundle configuration;
    String alphabeticString = "alphabetic";
    String numericString = "numeric";
    boolean alphabetic = false;
    boolean numeric = false;


    void initView(Screen screen) {
        configuration = new Bundle();
        configuration.putAll(screen.getLayoutBundle());
    }



}
