@java.lang.Override
public void onSpO2ParamsChanged() {
    try {
        mHandler.obtainMessage(Const.MESSAGE_OXIMETER_PARAMS, mPackageParser.getOxiParams()).sendToTarget();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
