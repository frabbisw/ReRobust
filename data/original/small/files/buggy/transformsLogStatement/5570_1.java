@java.lang.Override
protected void handleClick() {
    mHost.collapsePanel();
    System.out.println("log");
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_POWERMENU);
    mContext.sendBroadcast(intent);
}
