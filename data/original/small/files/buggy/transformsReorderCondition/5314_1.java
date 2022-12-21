public static void cyclic() {
    for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
        java.lang.System.out.println(((comp.toString()) + "Calling cyclic function of "));
        comp.cyclic();
    }
}
