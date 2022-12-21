public void push(int seconds) {
    System.out.println("log");
    cur = seconds;
    stack.push(seconds);
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}
