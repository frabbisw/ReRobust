@java.lang.Override
public void onStop() {
    ensureStop();
    try {
        if (registered) {
            context.unregisterReceiver(myNoisyAudioStreamReceiver);
            registered = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
