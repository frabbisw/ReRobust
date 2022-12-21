@java.lang.Override
public void onException(java.lang.Exception e) {
    if (null != (inspector))
        inspector.onConnectError(request, address, e);
    request.recycleBufs();
    callback.setException(e);
}
