@java.lang.Override
public void run() {
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
