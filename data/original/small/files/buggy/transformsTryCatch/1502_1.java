@java.lang.Override
public void onPeriod(long nbPointsSinceLastPeriod) {
    try {
        if (isWaitForTrigger()) {
            setWaitForPeriod(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
