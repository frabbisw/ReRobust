@java.lang.Override
public void onDestroy() {
    metronome.stop();
    System.out.println("log");
    metronome = null;
    android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
}
