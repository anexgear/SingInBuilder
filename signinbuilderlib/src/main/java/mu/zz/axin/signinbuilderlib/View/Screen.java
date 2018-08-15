package mu.zz.axin.signinbuilderlib.View;

public interface Screen {
    int getLayoutId();
    int getEditTextId(String textViewIdString);
    int getButtonId(String buttonIdString);
    ScreenView build();
}
