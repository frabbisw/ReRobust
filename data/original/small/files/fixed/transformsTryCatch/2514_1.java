@java.lang.Override
public boolean onClose() {
    mLocationResultsArray.clear();
    try {
        rebuildMap();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
