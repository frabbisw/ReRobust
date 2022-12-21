@java.lang.Override
public void exception(final java.lang.Throwable exception) {
    try {
        if (!(exception instanceof org.jowidgets.cap.common.api.exception.ServiceCanceledException)) {
            invocationCallback.exeption(exception);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
