@java.lang.Override
public void onCreate() {
    super.onCreate();
    initEvents();
    timeRec = new de.mhid.android.timerecordingforpebble.TimeRecConnector(this);
    try {
        messenger.initReceiver(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(this.getClass().getName(), "onCreate()");
}
