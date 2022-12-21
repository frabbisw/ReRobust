@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String value = input.getText().toString();
    try {
        if ((value.length()) > 0) {
            addFood(value);
            populateFoodListView();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
