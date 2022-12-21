@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    final int lastSelectedPosition = org.droidplanner.android.activities.LocatorActivity.lastPositions.indexOf(selectedMsg);
    try {
        outState.putInt(org.droidplanner.android.activities.LocatorActivity.STATE_LAST_SELECTED_POSITION, lastSelectedPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
