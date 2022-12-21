@com.facebook.react.bridge.ReactMethod
public void documentUpdate(java.lang.String appName, java.lang.String path, com.facebook.react.bridge.ReadableMap data, com.facebook.react.bridge.ReadableMap options, final com.facebook.react.bridge.Promise promise) {
    io.invertase.firebase.firestore.RNFirebaseDocumentReference ref = getDocumentForAppPath(appName, path);
    try {
        ref.update(data, options, promise);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
