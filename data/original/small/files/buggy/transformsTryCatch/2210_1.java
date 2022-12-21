public void onClick(android.content.DialogInterface dialog, int whichButton) {
    data.add(3, input.getText().toString());
    try {
        desc0 = input.getText().toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
