@com.facebook.react.bridge.ReactMethod
public void rotate(int rotation) {
    android.util.Log.e("YES", ("rotation : " + rotation));
    try {
        setApplicationOrientation(rotation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
