@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    android.content.Intent intent = new android.content.Intent(this, net.biospherecorp.microdoro.MyPreferenceActivity.class);
    intent.putExtra("orientation", getRequestedOrientation());
    startActivityForResult(intent, 1);
}
