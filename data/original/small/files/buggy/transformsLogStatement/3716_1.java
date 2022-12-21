private void clickOnce() {
    aRobot.click();
    System.out.println("log");
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
