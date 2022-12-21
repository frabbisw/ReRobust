@java.lang.Override
public void onCarrierNameNotMatch(int smsId, java.lang.String message) {
    try {
        android.widget.Toast.makeText(this, ("onCarrierNameNotMatch: " + message), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
