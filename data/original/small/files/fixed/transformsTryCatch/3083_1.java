@java.lang.Override
public android.os.IInterface createInterface() {
    android.os.IBinder binder = ServiceManager.getService.call(Context.MEDIA_ROUTER_SERVICE);
    try {
        if ((IMediaRouterService.Stub.asInterface) != null) {
            return IMediaRouterService.Stub.asInterface.call(binder);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
