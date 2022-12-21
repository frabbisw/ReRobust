public void deleteStrings() {
    com.uni_wuppertal.iad.vierteltour.ui.map.station_pager.StationFragment.ztitle.clear();
    try {
        com.uni_wuppertal.iad.vierteltour.ui.map.station_pager.StationFragment.descriptions.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.uni_wuppertal.iad.vierteltour.ui.map.station_pager.StationFragment.img.clear();
    com.uni_wuppertal.iad.vierteltour.ui.map.station_pager.StationFragment.aud.clear();
    com.uni_wuppertal.iad.vierteltour.ui.map.station_pager.StationFragment.vid.clear();
}
