@com.facebook.react.bridge.ReactMethod
public void rotate(int rotation) {
    System.out.println("log");
    android.util.Log.e("YES", ("rotation : " + rotation));
    setApplicationOrientation(rotation);
}
