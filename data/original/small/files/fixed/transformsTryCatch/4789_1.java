@org.junit.Test
public void checkTest() {
    try {
        if ((udao.checkUser("2012301130118", "wudazihuan")) != null) {
            java.lang.System.out.println("登录成功");
        } else
            java.lang.System.out.println("登录失败");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
