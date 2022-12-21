public void close() {
    try {
        if (((fr.s13d.photobackup.PBMediaStore.idCursor) != null) && (!(fr.s13d.photobackup.PBMediaStore.idCursor.isClosed()))) {
            fr.s13d.photobackup.PBMediaStore.idCursor.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fr.s13d.photobackup.PBMediaStore.picturesPreferences = null;
    fr.s13d.photobackup.PBMediaStore.picturesPreferencesEditor = null;
}
