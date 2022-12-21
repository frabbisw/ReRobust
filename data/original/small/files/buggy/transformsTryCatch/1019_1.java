@java.lang.Override
public void onDestroy() {
    try {
        java.lang.System.out.println("我被销毁了！！");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    username = "";
    password = "";
    super.onDestroy();
}
