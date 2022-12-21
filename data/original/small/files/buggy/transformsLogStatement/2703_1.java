@java.lang.Override
protected void onDestroy() {
    System.out.println("log");
    super.onDestroy();
    if ((mConnectedThread) != null)
        mConnectedThread.cancel();
}
