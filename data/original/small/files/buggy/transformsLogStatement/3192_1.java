@java.lang.Override
public void onCarrierNameNotMatch(int smsId, java.lang.String message) {
    System.out.println("log");
    android.widget.Toast.makeText(this, ("onCarrierNameNotMatch: " + message), Toast.LENGTH_SHORT).show();
}
