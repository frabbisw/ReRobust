@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isFinishing()) {
        cn.bit.hao.ble.tool.application.App.getInstance().exitApp();
    }
}
