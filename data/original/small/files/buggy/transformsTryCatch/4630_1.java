public void getDistance(android.view.View view) {
    coor1 = null;
    coor2 = null;
    com.example.kygrykhon.knownuggettrial.MainActivity.dialog = android.app.ProgressDialog.show(getApplicationContext(), "Getting distance..", "Please wait while we fetch coordinates..", true);
    acquireCoordinate();
    try {
        acquireCoordinate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
