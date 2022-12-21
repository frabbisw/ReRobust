@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.lasergiraffe.rideshare.util.SignUp.class);
    try {
        startActivity(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
