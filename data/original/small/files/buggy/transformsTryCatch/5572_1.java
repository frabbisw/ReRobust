public void placeBeacon(lilium.arubabacon.iBeacon beacon) {
    try {
        if (unplacedBeacons.contains(beacon)) {
            synchronized (placedBeacons) {
                placedBeacons.add(beacon);
            }
            synchronized (unplacedBeacons) {
                unplacedBeacons.remove(beacon);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
