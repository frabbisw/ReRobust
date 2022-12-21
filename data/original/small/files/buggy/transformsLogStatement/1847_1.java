@java.lang.Override
public void run() {
    System.out.println("log");
    android.util.Log.i("HIPSTER", "LOGIN SUCCESSFUL");
    android.content.Intent intent = new android.content.Intent(this, net.ilexiconn.hipster.MainActivity.class);
    intent.putExtra("magister", magister);
    startActivity(intent);
    finish();
}
