public void test_045() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/right_button");
    try {
        check(testcase.Object_Description, testcase.Operation_checkExist, "分享");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
