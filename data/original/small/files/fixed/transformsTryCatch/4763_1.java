@java.lang.Override
public void onException(java.lang.Exception e) {
    try {
        if ((inspector) != null)
            inspector.onConnectError(request, address, e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    callback.setException(e);
}
