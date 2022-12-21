public void placeVolumes(java.net.URI exportMaskURI, java.util.Map<java.net.URI, com.emc.storageos.db.client.model.Volume> volumes) {
    maskToVolumes.put(exportMaskURI, volumes);
    try {
        for (java.net.URI volumeId : volumes.keySet()) {
            unplacedVolumes.remove(volumeId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
