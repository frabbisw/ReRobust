@rxbus.ecaray.com.rxbuslib.rxbus.RxBusReact(clazz = { java.lang.String.class, java.lang.Integer.class })
public void showContent4(java.lang.String content, int i) {
    try {
        android.util.Log.d("tagutil", (("收到的参数: " + content) + i));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
