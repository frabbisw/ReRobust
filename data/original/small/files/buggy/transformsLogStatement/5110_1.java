private net.sourceforge.usbdm.constants.UsbdmSharedConstants.InterfaceType getInterfaceType() {
    System.out.println("log");
    int deviceIndex = comboInterfaceType.getSelectionIndex();
    if (deviceIndex < 0) {
        return null;
    }
    return interfaceTypes[deviceIndex];
}
