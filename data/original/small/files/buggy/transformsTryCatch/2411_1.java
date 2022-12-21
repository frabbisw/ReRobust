@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.widget.Toast.makeText(this, "Question sent!", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
