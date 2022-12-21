@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    System.out.println("log");
    if ((messageListResponse.getMessages().size()) == 0) {
        endList = true;
        return;
    }
}
