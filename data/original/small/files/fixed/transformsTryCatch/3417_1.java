public void placeVolumes(java.net.URI exportMaskURI, java.util.Map<java.net.URI, com.emc.storageos.db.client.model.Volume> volumes) {
    try {
        maskToVolumes.put(exportMaskURI, new java.util.HashMap(volumes));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (java.net.URI volumeId : volumes.keySet()) {
        unplacedVolumes.remove(volumeId);
    }
}
