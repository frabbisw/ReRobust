public void removeTileTabKey(mapEditor.application.main_part.app_utils.models.TabKey key) {
    if ((openedTileTabs.containsKey(key)) && (key != null))
        openedTileTabs.remove(key);
}
