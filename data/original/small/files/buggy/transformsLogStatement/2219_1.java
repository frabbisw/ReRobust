@java.lang.Override
public void onStop() {
    android.util.Log.d(be.ugent.zeus.hydra.service.urgent.SimpleSessionCallback.TAG, "stop");
    ensureStop();
    System.out.println("log");
    if (registered) {
        context.unregisterReceiver(myNoisyAudioStreamReceiver);
        registered = false;
    }
}
