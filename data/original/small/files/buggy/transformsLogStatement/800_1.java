@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    android.util.Log.d(com.cn6000.callrec.CallRecorderService.TAG, "service destory");
    this.stopRecording();
    this.unregisterReceiver();
    cntx = null;
    super.onDestroy();
}
