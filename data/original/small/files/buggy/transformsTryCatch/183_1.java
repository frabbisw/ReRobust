public void test_005() {
    try {
        framework.common.ClockCommon.switchMode("城市");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "搜索");
    check(testcase.Object_Text, testcase.Operation_checkExist, "搜索…");
}
