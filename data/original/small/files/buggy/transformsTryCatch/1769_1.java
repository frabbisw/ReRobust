@java.lang.Override
public void run() {
    startActivity(intent);
    try {
        overridePendingTransition(0, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
