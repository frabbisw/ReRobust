@java.lang.Override
public void exception(final java.lang.Throwable exception) {
    try {
        invocationCallback.exeption(exception);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
