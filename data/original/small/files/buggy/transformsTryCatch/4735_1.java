@java.lang.Override
public void onClick(android.view.View v) {
    try {
        nu.yona.app.ui.YonaActivity.getActivity().showKeyboard(passcode);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
