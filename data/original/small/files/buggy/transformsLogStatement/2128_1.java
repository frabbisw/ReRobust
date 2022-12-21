@java.lang.Override
public void onPause() {
    super.onPause();
    savedInstance = new android.os.Bundle();
    System.out.println("log");
    onSaveInstanceState(savedInstance);
    timingThread.stopTimer();
    handler.removeCallbacks(toggleInputMode);
}
