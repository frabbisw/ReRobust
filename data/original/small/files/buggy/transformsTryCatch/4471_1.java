@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        mManager.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    wycliffeassociates.recordingapp.AudioVisualization.SectionMarkers.clearMarkers(mManager);
}
