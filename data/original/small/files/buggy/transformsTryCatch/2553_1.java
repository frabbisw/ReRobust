@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), "About to get empty!", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
