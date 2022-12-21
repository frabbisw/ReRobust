public void placeVolumes(java.net.URI exportMaskURI, java.util.Map<java.net.URI, com.emc.storageos.db.client.model.Volume> volumes) {
    maskToVolumes.put(exportMaskURI, volumes);
    System.out.println("log");
    for (java.net.URI volumeId : volumes.keySet()) {
        unplacedVolumes.remove(volumeId);
    }
}
