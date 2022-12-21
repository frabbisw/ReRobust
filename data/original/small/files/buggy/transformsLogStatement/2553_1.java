@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    System.out.println("log");
    android.widget.Toast.makeText(getApplicationContext(), "About to get empty!", Toast.LENGTH_SHORT).show();
}
