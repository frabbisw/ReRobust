@java.lang.Override
public void run() {
    mCurrentSelectedMarkerClustered = false;
    try {
        mCurrentSelectedMarker = addSelectedMarker(mCurrentSelectedItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
