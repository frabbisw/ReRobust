@java.lang.Override
public void onCloseResult(boolean closeOK) {
    state = org.runnerup.hr.RetryingHRProviderProxy.State.CLOSED;
    requestedState = org.runnerup.hr.RetryingHRProviderProxy.State.CLOSED;
    try {
        client.onConnectResult(closeOK);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
