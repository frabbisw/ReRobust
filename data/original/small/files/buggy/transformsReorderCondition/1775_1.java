private void sleep(int time) {
    long startTime = java.lang.System.currentTimeMillis();
    while (time > ((java.lang.System.currentTimeMillis()) - startTime)) ;
}
