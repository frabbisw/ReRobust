@java.lang.Override
public void recreate() {
    System.out.println("log");
    if ((android.os.Build.VERSION.SDK_INT) >= 11) {
        super.recreate();
    } else {
        startActivity(getIntent());
        finish();
    }
}
