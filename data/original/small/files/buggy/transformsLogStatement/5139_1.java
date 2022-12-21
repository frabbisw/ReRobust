public void settings() {
    System.out.println("log");
    android.app.Dialog dialog = new android.app.Dialog(this);
    text1 = ((android.widget.TextView) (dialog.findViewById(R.id.textView2)));
    dialog.setContentView(R.layout.dialogbox);
    dialog.show();
}
