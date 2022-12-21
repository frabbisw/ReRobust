@org.junit.Test
public void checkTest() {
    System.out.println("log");
    if (udao.checkUser("2012301130118", "wudazihuan")) {
        java.lang.System.out.println("登录成功");
    } else
        java.lang.System.out.println("登录失败");
}
