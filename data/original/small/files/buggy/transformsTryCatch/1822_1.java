@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (!(POIpath.getText().toString().equals("")))
            checkPathField();
        else
            addNewPOI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
