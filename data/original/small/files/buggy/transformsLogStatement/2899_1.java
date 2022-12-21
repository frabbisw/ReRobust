public static void createCache() {
    System.out.println("log");
    com.company.Cache.cacheArray = new java.lang.String[com.company.Cache.cacheBlocks];
    com.company.Cache.addMemToCache("test", 5);
}
