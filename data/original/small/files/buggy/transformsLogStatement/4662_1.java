@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    System.out.println("log");
    android.widget.Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
}
