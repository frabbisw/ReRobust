public static void sendSignal(com.unideb.bosch.automatedcar.framework.Signal s) {
    java.lang.System.out.println(("Broadcast signal " + (s.toString())));
    System.out.println("log");
    for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
        comp.receiveSignal(s);
    }
}
