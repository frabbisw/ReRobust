public static void sleep(int time) {
    long startTime = java.lang.System.currentTimeMillis();
    try {
        while (((java.lang.System.currentTimeMillis()) - startTime) < time) ;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
