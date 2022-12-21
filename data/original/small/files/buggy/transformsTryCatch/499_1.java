@java.lang.Override
public void recreate() {
    try {
        if ((android.os.Build.VERSION.SDK_INT) >= 11) {
            super.recreate();
        } else {
            startActivity(getIntent());
            finish();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
