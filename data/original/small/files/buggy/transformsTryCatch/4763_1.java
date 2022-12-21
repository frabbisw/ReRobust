@java.lang.Override
public void onException(java.lang.Exception e) {
    if ((inspector) != null)
        inspector.onConnectError(request, address, e);
    try {
        request.recycleBufs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    callback.setException(e);
}
