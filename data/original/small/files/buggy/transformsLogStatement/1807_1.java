@java.lang.Override
public void onSpO2ParamsChanged() {
    com.berry_med.dataparser.PackageParser.OxiParams params = mPackageParser.getOxiParams();
    System.out.println("log");
    mHandler.obtainMessage(Const.MESSAGE_OXIMETER_PARAMS, params.getSpo2(), params.getPulseRate()).sendToTarget();
}
