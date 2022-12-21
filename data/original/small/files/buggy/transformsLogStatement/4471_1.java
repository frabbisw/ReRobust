@java.lang.Override
public void onPause() {
    super.onPause();
    System.out.println("log");
    mManager.release();
    wycliffeassociates.recordingapp.AudioVisualization.SectionMarkers.clearMarkers(mManager);
}
