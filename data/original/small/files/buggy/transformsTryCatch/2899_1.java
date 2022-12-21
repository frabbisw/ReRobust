public static void createCache() {
    com.company.Cache.cacheArray = new java.lang.String[com.company.Cache.cacheBlocks];
    try {
        com.company.Cache.addMemToCache("test", 5);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
