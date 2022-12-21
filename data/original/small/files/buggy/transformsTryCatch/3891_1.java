public void onClick(android.content.DialogInterface dialog, int id) {
    try {
        for (de.dhbwloerrach.beaconlocation.models.Beacon beacon : selectedBeacons) {
            selectedBeacons.remove(beacon);
            databaseHandler.deleteBeacon(beacon);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateBeaconListView();
    updateMenuButtons();
}
