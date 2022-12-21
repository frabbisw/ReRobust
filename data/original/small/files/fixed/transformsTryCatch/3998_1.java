@java.lang.Override
protected void onPostExecute(java.lang.String msg) {
    messageEditText.setText("");
    try {
        sendMessageButton.setClickable(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    messageEditText.requestFocus();
}
