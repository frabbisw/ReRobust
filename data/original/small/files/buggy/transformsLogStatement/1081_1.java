@java.lang.Override
public void run() {
    System.out.println("log");
    try {
        c = new frontend.Connection();
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(this, "Error occurred while loading page", Toast.LENGTH_SHORT).show();
        noConnection = false;
        finish();
    }
}
