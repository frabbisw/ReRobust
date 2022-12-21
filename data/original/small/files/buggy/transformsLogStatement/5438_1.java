@java.lang.Override
public void onResume() {
    super.onResume();
    System.out.println("log");
    createSocketListeners();
    mUsername = com.niemisami.wedu.settings.WeduPreferenceHelper.getUsername(getActivity());
}
