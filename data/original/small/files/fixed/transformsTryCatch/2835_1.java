@java.lang.Override
public void onClick(android.view.View view) {
    sendMessageWithPayload(mMessageEditText.getText().toString(), FriendlyMessage.MessageType.Text, false, false);
    try {
        mMessageEditText.setText("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
