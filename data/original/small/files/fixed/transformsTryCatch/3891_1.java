public void onClick(android.content.DialogInterface dialog, int id) {
    for (de.dhbwloerrach.beaconlocation.models.Beacon beacon : new java.util.ArrayList(selectedBeacons)) {
        selectedBeacons.remove(beacon);
        databaseHandler.deleteBeacon(beacon);
    }
    try {
        updateBeaconListView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateMenuButtons();
}
