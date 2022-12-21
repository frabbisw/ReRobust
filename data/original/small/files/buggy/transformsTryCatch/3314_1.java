private static void manualAnimeAdd(java.lang.String name, util.AnimeData data, java.lang.String finishDate, java.lang.String type) {
    java.lang.String list = util.window.AddAnimeDialog.checkDataConflict(finishDate, type);
    try {
        util.window.AddAnimeDialog.checkAnimeAlreadyAdded(name, list, data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
