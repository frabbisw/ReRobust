public void onClick(android.content.DialogInterface dialog, int whichButton) {
    try {
        data.set(3, input.getText().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    desc0 = input.getText().toString();
}
