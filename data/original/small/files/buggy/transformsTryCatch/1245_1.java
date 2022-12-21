@java.lang.Override
public void onStatusChanged(java.lang.String s, int i, android.os.Bundle bundle) {
    try {
        android.util.Log.e(com.theah64.pigeon.services.LocationReporterService.X, ("Status changed " + s));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
