@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (!(POIpath.getText().toString().equals("")))
        checkPathField();
    else
        addNewPOI();
}
