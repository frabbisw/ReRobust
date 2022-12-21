@java.lang.Override
public void onClick(android.view.View view) {
    try {
        sendMessageWithPayload(mMessageEditText.getText().toString(), FriendlyMessage.MessageType.Text, false, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mMessageEditText.setText("");
}
