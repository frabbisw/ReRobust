@java.lang.Override
public void run() {
    android.util.Log.i("HIPSTER", "LOGIN SUCCESSFUL");
    android.content.Intent intent = new android.content.Intent(this, net.ilexiconn.hipster.MainActivity.class);
    try {
        intent.putExtra("magister", magister);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(intent);
    finish();
}
