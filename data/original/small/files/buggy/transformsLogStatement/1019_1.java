@java.lang.Override
public void onDestroy() {
    java.lang.System.out.println("我被销毁了！！");
    System.out.println("log");
    username = "";
    password = "";
    super.onDestroy();
}
