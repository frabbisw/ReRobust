@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent myIntent = new android.content.Intent(this, com.example.douglass_macbook.ss12_simon_says.ActivityInstruction.class);
    try {
        this.startActivityForResult(myIntent, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
