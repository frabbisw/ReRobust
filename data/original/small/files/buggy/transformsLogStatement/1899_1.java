@java.lang.Override
public void onClick(android.view.View view) {
    started = false;
    instop = true;
    System.out.println("log");
    android.widget.Toast.makeText(this, "recording has stopped, restart for continue or load another dataset", Toast.LENGTH_SHORT).show();
}