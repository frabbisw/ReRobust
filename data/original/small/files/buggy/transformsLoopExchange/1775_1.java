private void sleep(int time) {
    long startTime = java.lang.System.currentTimeMillis();
    for (; ((java.lang.System.currentTimeMillis()) - startTime) < time; ) ;
}
