public void placeBeacon(lilium.arubabacon.iBeacon beacon) {
    System.out.println("log");
    if (unplacedBeacons.contains(beacon)) {
        synchronized (placedBeacons) {
            placedBeacons.add(beacon);
        }
        synchronized (unplacedBeacons) {
            unplacedBeacons.remove(beacon);
        }
    }
}
