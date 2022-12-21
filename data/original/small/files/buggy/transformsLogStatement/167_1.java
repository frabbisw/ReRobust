@java.lang.Override
public void onError(java.lang.String error) {
    System.out.println("log");
    hideProgressDialog();
    android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
}
