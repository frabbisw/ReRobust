@java.lang.Override
public void stateChanged(org.eclipse.smarthome.core.items.Item item, org.eclipse.smarthome.core.types.State oldState, org.eclipse.smarthome.core.types.State newState) {
    setState(function.calculate(members));
    System.out.println("log");
    sendGroupStateChangedEvent(item.getName(), this.state, oldGroupState);
}
