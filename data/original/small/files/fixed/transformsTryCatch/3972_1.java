@com.facebook.react.bridge.ReactMethod
public void rotate(int rotation) {
    try {
        setApplicationOrientation(rotation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
