@java.lang.Override
public void run() {
    mCurrentSelectedMarkerClustered = true;
    try {
        mCurrentSelectedMarker = addSelectedMarker(mCurrentSelectedItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
