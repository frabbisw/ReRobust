public void push(int seconds) {
    cur = seconds;
    try {
        stack.push(seconds);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}
