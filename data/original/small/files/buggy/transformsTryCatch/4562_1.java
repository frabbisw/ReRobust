public void run() {
    setPriority(java.lang.Thread.MAX_PRIORITY);
    try {
        com.utyf.pmetro.map.TRP.rt.createGraph();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.utyf.pmetro.map.TRP.setStart(com.utyf.pmetro.map.TRP.routeStart);
    com.utyf.pmetro.map.TRP.setEnd(com.utyf.pmetro.map.TRP.routeEnd);
    progDialog.dismiss();
    MapActivity.mapActivity.mapView.redraw();
}
