@java.lang.Override
public void onPause() {
    super.onPause();
    com.example.emile1.findaparty.Activity.MapStateManager mgr = new com.example.emile1.findaparty.Activity.MapStateManager(getContext());
    System.out.println("log");
    mgr.saveMapState(googleMap);
}
