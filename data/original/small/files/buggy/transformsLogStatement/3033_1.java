public void removeTileTabKey(mapEditor.application.main_part.app_utils.models.TabKey key) {
    System.out.println("log");
    if ((key != null) && (openedTileTabs.containsKey(key)))
        openedTileTabs.remove(key);
}
