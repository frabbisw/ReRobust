@java.lang.Override
public void handlerNotification(android.content.Context context, boolean binded, com.yy.httpproxy.service.PushedNotification pushedNotification) {
    if (!binded) {
        showNotification(context, pushedNotification);
    }
    try {
        sendArrived(context, pushedNotification);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
