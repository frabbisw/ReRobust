public void addDeviceDataMap(com.emc.storageos.db.client.model.StringSetMap deviceDataMapEntries) {
    try {
        if ((this.deviceDataMap) == null) {
            setDeviceDataMap(deviceDataMapEntries);
        } else {
            this.deviceDataMap.putAll(deviceDataMapEntries);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
