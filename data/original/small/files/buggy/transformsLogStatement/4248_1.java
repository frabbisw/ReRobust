public boolean refreshList(android.view.MenuItem item) {
    new me.blueland.metro.activity.BusStationPre.BusController().execute(stationCode);
    System.out.println("log");
    return true;
}
