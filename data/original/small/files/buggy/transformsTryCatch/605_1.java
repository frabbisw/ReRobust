private void doQuery(int queryNumber) throws java.lang.InterruptedException {
    StopWatch sw = new StopWatch();
    sw.start();
    try {
        java.lang.Thread.sleep(queryTime);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
