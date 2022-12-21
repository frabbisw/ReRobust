public java.util.List<com.arjanvlek.cyngnotainfo.Model.Device> getDevices() {
    if (null == (devices)) {
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
