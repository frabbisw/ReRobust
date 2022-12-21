public java.util.List<com.arjanvlek.cyngnotainfo.Model.Device> getDevices() {
    try {
        fetchDataFromServer("device");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (offline) {
        return offlineDevices;
    } else {
        return devices;
    }
}
