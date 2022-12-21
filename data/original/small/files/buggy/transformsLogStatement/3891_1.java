public void onClick(android.content.DialogInterface dialog, int id) {
    System.out.println("log");
    for (de.dhbwloerrach.beaconlocation.models.Beacon beacon : selectedBeacons) {
        selectedBeacons.remove(beacon);
        databaseHandler.deleteBeacon(beacon);
    }
    updateBeaconListView();
    updateMenuButtons();
}
