private void pushToAllDevices(org.onosproject.net.packet.impl.PacketManager.PacketRequest request) {
    for (org.onosproject.net.Device device : deviceService.getDevices()) {
        if ((org.onosproject.net.MastershipRole.MASTER) == (deviceService.getRole(device.id()))) {
            pushRule(device, request);
        }
    }
}
