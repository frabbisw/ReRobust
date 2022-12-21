public boolean refreshList(android.view.MenuItem item) {
    try {
        new me.blueland.metro.activity.BusStationPre.BusController().execute(stationCode);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
