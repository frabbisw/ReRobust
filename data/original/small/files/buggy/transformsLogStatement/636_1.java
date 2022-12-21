@java.lang.Override
public void onMapBackgroundTouch() {
    System.out.println("log");
    raceListOverlay.unSetFocusedItem();
    mMapView.invalidate();
    raceVM.onMapBackgroundTouch();
}
