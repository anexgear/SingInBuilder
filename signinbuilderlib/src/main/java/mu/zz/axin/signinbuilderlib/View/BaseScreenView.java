package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

import mu.zz.axin.signinbuilderlib.View.interfaces.Screen;

public abstract class BaseScreenView implements Screen {

    Bundle args;


    @Override
    public Bundle getLayoutBundle() {
        return args;
    }

}
