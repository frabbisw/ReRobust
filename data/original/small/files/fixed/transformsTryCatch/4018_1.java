public void push(int seconds) {
    try {
        stack.push(cur);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cur = seconds;
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}
