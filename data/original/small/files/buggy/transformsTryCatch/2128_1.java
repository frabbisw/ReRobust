@java.lang.Override
public void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    savedInstance = new android.os.Bundle();
    onSaveInstanceState(savedInstance);
    timingThread.stopTimer();
    handler.removeCallbacks(toggleInputMode);
}
