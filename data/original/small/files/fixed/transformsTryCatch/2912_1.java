@java.lang.Override
public void handleResult(java.lang.String data) {
    try {
        updateServerUserData(localProfile, true, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
