@java.lang.Override
public void run() {
    android.content.Intent intent = new android.content.Intent(this, net.ilexiconn.hipster.MainActivity.class);
    intent.putExtra("magister", magister);
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
