@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), "Suggestion Selected!", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
