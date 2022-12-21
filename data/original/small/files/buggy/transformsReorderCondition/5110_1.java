private net.sourceforge.usbdm.constants.UsbdmSharedConstants.InterfaceType getInterfaceType() {
    int deviceIndex = comboInterfaceType.getSelectionIndex();
    if (0 > deviceIndex) {
        return null;
    }
    return interfaceTypes[deviceIndex];
}
