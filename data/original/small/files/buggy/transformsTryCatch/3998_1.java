@java.lang.Override
protected void onPostExecute(java.lang.String msg) {
    try {
        messageEditText.setText("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sendMessageButton.setClickable(true);
    messageEditText.requestFocus();
    populateMessages();
}
