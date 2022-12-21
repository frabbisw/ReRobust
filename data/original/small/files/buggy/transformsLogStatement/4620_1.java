@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    System.out.println("log");
    android.widget.Toast.makeText(getApplicationContext(), "Suggestion Selected!", Toast.LENGTH_SHORT);
}
