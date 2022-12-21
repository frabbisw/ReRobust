@java.lang.Override
public void onError(int error) {
    android.util.Log.e(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, (error + "failed to connect/discover: "));
    dlg.dismiss();
    getActivity().finish();
}
