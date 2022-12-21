public static void cyclic() {
    System.out.println("log");
    for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
        java.lang.System.out.println(("Calling cyclic function of " + (comp.toString())));
        comp.cyclic();
    }
}
