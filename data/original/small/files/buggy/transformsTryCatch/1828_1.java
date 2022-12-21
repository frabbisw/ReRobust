public void loadNar(java.nio.file.Path path) throws java.io.IOException {
    nak.nakloidGUI.coredata.CoreData.decompressNar(path);
    pathNar = path;
    reloadScoreAndPitches();
    try {
        NakloidGUI.preferenceStore.setValue("workspace.path_nar", path.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isSaved(true);
}
