private static void manualAnimeAdd(java.lang.String name, util.AnimeData data, java.lang.String finishDate, java.lang.String type) {
    System.out.println("log");
    java.lang.String list = util.window.AddAnimeDialog.checkDataConflict(finishDate, type);
    util.window.AddAnimeDialog.checkAnimeAlreadyAdded(name, list, data);
}
