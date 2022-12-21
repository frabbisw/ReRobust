public void removeTileTabKey(mapEditor.application.main_part.app_utils.models.TabKey key) {
    try {
        if ((key != null) && (openedTileTabs.contains(key)))
            openedTileTabs.remove(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
