@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    if (0 == (messageListResponse.getMessages().size())) {
        endList = true;
        return;
    }
}
