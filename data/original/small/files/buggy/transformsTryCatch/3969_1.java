@java.lang.Override
public void onConnectionSuspended(int i) {
    try {
        com.andela.motustracker.model.ActivityRecognitionScan.googleApiClient.connect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
