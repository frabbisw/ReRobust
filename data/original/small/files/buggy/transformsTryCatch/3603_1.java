@java.lang.SuppressWarnings(value = "unchecked")
private java.util.Enumeration<com.konradjamrozik.botmate.controller.CommPortIdentifier> getPortIdentifiers() {
    try {
        com.konradjamrozik.botmate.controller.CommPortIdentifier.addPortName();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.konradjamrozik.botmate.controller.CommPortIdentifier.getPortIdentifiers();
}
