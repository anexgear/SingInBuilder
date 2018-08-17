package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

public interface Screen {
    int getLayoutId();
    int getEditTextId(String textViewIdString);
    int getButtonId(String buttonIdString);
    Bundle getLayoutBundle();

    ScreenView build();
}
