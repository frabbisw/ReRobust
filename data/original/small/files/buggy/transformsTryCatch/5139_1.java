public void settings() {
    android.app.Dialog dialog = new android.app.Dialog(this);
    text1 = ((android.widget.TextView) (dialog.findViewById(R.id.textView2)));
    dialog.setContentView(R.layout.dialogbox);
    try {
        dialog.show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
