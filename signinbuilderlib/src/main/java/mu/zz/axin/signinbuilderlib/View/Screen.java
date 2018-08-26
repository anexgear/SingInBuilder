package mu.zz.axin.signinbuilderlib.View;

import android.os.Bundle;

public interface Screen {

    Bundle getLayoutBundle();

    ScreenView build();
}
