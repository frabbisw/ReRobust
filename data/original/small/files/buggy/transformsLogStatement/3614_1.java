@java.lang.Override
protected void updateDeviceProfile(final org.sump.device.logicsniffer.DeviceProfile aProfile) {
    System.out.println("log");
    this.listening = false;
    try {
        updateDeviceType(aProfile);
        updateConfig(false);
        updateFields();
    } finally {
        this.listening = true;
    }
}
