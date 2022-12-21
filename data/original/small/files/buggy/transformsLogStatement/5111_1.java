public static int getDefaultLruCacheSize() {
    System.out.println("log");
    final int maxMemory = ((int) ((java.lang.Runtime.getRuntime().maxMemory()) / 1024));
    final int cacheSize = maxMemory / 8;
    return cacheSize;
}
