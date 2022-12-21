@java.lang.Override
public void onDestroy() {
    metronome.stop();
    metronome = null;
    try {
        android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
