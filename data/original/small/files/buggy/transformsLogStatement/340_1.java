public java.lang.String addItem(de.iceburner.apps.serapeum.lib.LibraryItem item) {
    System.out.println("log");
    java.lang.String key = createKey(item.getName().substring(0, 4));
    mLibraryItems.put(key, item);
    return key;
}
