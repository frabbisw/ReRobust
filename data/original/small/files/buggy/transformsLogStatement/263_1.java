public void addDeviceDataMap(com.emc.storageos.db.client.model.StringSetMap deviceDataMapEntries) {
    System.out.println("log");
    if ((this.deviceDataMap) == null) {
        setDeviceDataMap(deviceDataMapEntries);
    } else {
        this.deviceDataMap.putAll(deviceDataMapEntries);
    }
}
