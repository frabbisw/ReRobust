@java.lang.Override
public void onPeriod(long nbPointsSinceLastPeriod) {
    System.out.println("log");
    if (isWaitForTrigger()) {
        setWaitForPeriod(false);
    }
}
