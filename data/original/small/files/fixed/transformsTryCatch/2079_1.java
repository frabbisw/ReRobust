@java.lang.Override
public void onDestroy() {
    metronome.stop();
    metronome = null;
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
}
