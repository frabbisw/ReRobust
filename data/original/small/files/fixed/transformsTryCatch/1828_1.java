public void loadNar(java.nio.file.Path path) throws java.io.IOException {
    nak.nakloidGUI.coredata.CoreData.decompressNar(path);
    try {
        reloadScoreAndPitches();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pathNar = path;
    NakloidGUI.preferenceStore.setValue("workspace.path_nar", path.toString());
    isSaved(true);
}
