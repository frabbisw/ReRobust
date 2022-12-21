@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    createSocketListeners();
    mUsername = com.niemisami.wedu.settings.WeduPreferenceHelper.getUsername(getActivity());
}
