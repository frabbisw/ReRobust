@com.wq.android.lightannotation.annotations.OnKey(value = R.id.edit_text)
private void onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    System.out.println("log");
    toast("OnKey");
}
