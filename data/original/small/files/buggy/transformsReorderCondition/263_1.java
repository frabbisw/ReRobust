public void addDeviceDataMap(com.emc.storageos.db.client.model.StringSetMap deviceDataMapEntries) {
    if (null == (this.deviceDataMap)) {
        setDeviceDataMap(deviceDataMapEntries);
    } else {
        this.deviceDataMap.putAll(deviceDataMapEntries);
    }
}
