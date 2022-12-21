protected com.emc.storageos.db.client.model.BlockSnapshot prepareSnapshotFromVolume(com.emc.storageos.db.client.model.Volume volume, java.lang.String label) {
    System.out.println("log");
    return prepareSnapshotFromVolume(volume, label, label);
}
