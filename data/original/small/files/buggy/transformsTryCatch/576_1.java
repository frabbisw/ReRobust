@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, net.biospherecorp.microdoro.MyPreferenceActivity.class);
    intent.putExtra("orientation", getRequestedOrientation());
    try {
        startActivityForResult(intent, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
