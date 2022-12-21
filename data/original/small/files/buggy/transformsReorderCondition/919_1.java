@java.lang.Override
protected synchronized void doSetMode(net.sf.dz3.device.model.HvacMode mode) throws java.io.IOException {
    checkEnabled();
    boolean state = mode == (net.sf.dz3.device.model.HvacMode.HEATING);
    switchMode.setState((reverseMode ? !state : state));
}
