@java.lang.Override
public void channelUnlinked(org.eclipse.smarthome.core.thing.ChannelUID channelUID) {
    try {
        super.channelUnlinked(channelUID);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    bluetoothSmartService.removeCharacteristicListener(getDeviceAddress(), getServiceUUID(channelUID.getIdWithoutGroup()), getCharacteristicUUID(channelUID.getIdWithoutGroup()));
}
