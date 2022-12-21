@java.lang.Override
public void handleResult(java.lang.String data) {
    try {
        updateServerUserData(localProfile, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
