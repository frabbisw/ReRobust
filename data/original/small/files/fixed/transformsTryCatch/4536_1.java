@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    try {
        if ((messageListResponse.getMessages().size()) == 0) {
            endList = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
