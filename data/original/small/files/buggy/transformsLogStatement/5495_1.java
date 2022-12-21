@java.lang.Override
public void onCloseResult(boolean closeOK) {
    System.out.println("log");
    state = org.runnerup.hr.RetryingHRProviderProxy.State.CLOSED;
    requestedState = org.runnerup.hr.RetryingHRProviderProxy.State.CLOSED;
    client.onConnectResult(closeOK);
}
