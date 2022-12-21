public void waitTime(long time) {
    System.out.println("log");
    currentTime += 33;
    try {
        java.lang.Thread.sleep(time);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
