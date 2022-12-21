private void sleep(int time) {
    System.out.println("log");
    long startTime = java.lang.System.currentTimeMillis();
    while (((java.lang.System.currentTimeMillis()) - startTime) < time) ;
}
