public static void initNavigationItem() {
    try {
        plugins.cms.navigation.NavigationCache.items.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.List<models.cms.NavigationItem> roots = models.cms.NavigationItem.findByParent(null);
    plugins.cms.navigation.NavigationCache.createItemsForNavigationItems(roots);
}
