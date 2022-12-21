@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String value = input.getText().toString();
    try {
        addFood(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    populateFoodListView();
}
