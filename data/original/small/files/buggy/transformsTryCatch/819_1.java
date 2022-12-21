@java.lang.Override
public void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.example.emile1.findaparty.Activity.MapStateManager mgr = new com.example.emile1.findaparty.Activity.MapStateManager(getContext());
    mgr.saveMapState(googleMap);
}
