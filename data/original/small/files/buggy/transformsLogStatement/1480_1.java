@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    android.content.Intent i2 = new android.content.Intent(this, heyheyoheyhey.com.ifoundclassmate3.registerActivity.class);
    startActivityForResult(i2, 2);
}
