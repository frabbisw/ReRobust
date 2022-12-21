@java.lang.Override
public void run() {
    System.out.println("log");
    try {
        getHostData.availability = infoHelper.readAvailability(getHostData.hostName, getModuleData.availabilityUrl);
    } catch (java.io.IOException ex) {
    }
}
