@java.lang.Override
public void recreate() {
    if (11 <= (android.os.Build.VERSION.SDK_INT)) {
        super.recreate();
    } else {
        startActivity(getIntent());
        finish();
    }
}
