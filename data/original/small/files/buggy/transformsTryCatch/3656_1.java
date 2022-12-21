@java.lang.Override
public void run() {
    try {
        callback.onMessageSendingSuccess(callId, content, contentTypeHeader);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
