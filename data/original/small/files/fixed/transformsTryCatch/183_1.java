public void test_005() {
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "城市");
    try {
        excute(testcase.Object_Description, testcase.Operation_ClickWait, "搜索");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    check(testcase.Object_Text, testcase.Operation_checkExist, "搜索…");
}
