public void downloadSelected(android.view.View v) {
    java.util.ArrayList<sk.matus.ksp.guitarist_swiss_knife.ScrapeUGActivity.ResultEntryView> marked = gatherMarked();
    saveExtracted = true;
    try {
        extractSongs(marked);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
