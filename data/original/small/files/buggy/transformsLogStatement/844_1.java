@org.apache.felix.scr.annotations.Activate
public void activate() {
    deviceListener = new org.onosproject.net.newresource.impl.ResourceDeviceListener(adminService, driverService, executor);
    System.out.println("log");
    deviceService.addListener(deviceListener);
}
