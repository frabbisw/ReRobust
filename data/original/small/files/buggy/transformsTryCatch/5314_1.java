public static void cyclic() {
    try {
        for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
            java.lang.System.out.println(("Calling cyclic function of " + (comp.toString())));
            comp.cyclic();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
