@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String value = input.getText().toString();
    addFood(value);
    System.out.println("log");
    populateFoodListView();
}
