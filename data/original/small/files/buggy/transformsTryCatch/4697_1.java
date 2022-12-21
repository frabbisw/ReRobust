private void selectOnMap(org.activityinfo.ui.client.component.form.field.map.MapItem mapItem) {
    map.panTo(mapItem.getLatLng());
    try {
        map.setView(mapItem.getLatLng(), org.activityinfo.ui.client.component.form.field.map.MapPanel.ZOOM_LEVEL, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
