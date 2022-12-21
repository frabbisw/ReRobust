@java.lang.Override
public void onMapBackgroundTouch() {
    raceListOverlay.unSetFocusedItem();
    mMapView.invalidate();
    try {
        raceVM.onMapBackgroundTouch();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
