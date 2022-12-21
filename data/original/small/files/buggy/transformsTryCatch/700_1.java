@java.lang.Override
public void onError(int error) {
    try {
        android.util.Log.e(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("failed to connect/discover: " + error));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dlg.dismiss();
    getActivity().finish();
}
