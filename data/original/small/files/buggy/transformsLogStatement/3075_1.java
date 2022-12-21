@java.lang.Override
protected void onDestroy() {
    System.out.println("log");
    listener.turnOffFlash(this);
    super.onDestroy();
}
