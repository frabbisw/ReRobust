@org.apache.felix.scr.annotations.Activate
public void activate() {
    deviceListener = new org.onosproject.net.newresource.impl.ResourceDeviceListener(adminService, driverService, executor);
    try {
        deviceService.addListener(deviceListener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
