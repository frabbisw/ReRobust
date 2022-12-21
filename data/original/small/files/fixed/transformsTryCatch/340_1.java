public java.lang.String addItem(de.iceburner.apps.serapeum.lib.LibraryItem item) {
    java.lang.String key = createKey(item.getName().substring(0, 4), mLibraryItems);
    try {
        mLibraryItems.put(key, item);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return key;
}
