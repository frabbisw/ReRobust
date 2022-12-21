public java.util.List<com.arjanvlek.cyngnotainfo.Model.Device> getDevices() {
    try {
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
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
