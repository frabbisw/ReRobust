@java.lang.Override
public void onDestroy() {
    try {
        android.util.Log.d(com.cn6000.callrec.CallRecorderService.TAG, "service destory");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.stopRecording();
    this.unregisterReceiver();
    cntx = null;
    super.onDestroy();
}
