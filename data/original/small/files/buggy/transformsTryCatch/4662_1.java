@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    try {
        android.widget.Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
