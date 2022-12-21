@java.lang.Override
public void onConnectionSuspended(int i) {
    System.out.println("log");
    com.andela.motustracker.model.ActivityRecognitionScan.googleApiClient.connect();
}
