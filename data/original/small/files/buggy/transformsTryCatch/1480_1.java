@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i2 = new android.content.Intent(this, heyheyoheyhey.com.ifoundclassmate3.registerActivity.class);
    try {
        startActivityForResult(i2, 2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
