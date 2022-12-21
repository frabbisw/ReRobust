@java.lang.Override
protected void onStart() {
    try {
        super.onStart();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mGoogleApiClient.connect();
}
