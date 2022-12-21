public static void sendSignal(com.unideb.bosch.automatedcar.framework.Signal s) {
    try {
        for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
            comp.receiveSignal(s);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
