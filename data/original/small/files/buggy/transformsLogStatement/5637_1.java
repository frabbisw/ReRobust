@java.lang.Override
protected void onPause() {
    System.out.println("log");
    super.onPause();
    if (isFinishing()) {
        cn.bit.hao.ble.tool.application.App.getInstance().exitApp();
    }
}
