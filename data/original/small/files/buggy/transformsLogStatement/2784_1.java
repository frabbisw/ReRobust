public java.util.List<com.arjanvlek.cyngnotainfo.Model.Device> getDevices() {
    System.out.println("log");
    if ((devices) == null) {
        fetchDataFromServer("device");
        if (offline) {
            return offlineDevices;
        } else {
            return devices;
        }
    } else {
        return devices;
    }
}
