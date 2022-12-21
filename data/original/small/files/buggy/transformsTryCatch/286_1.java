@java.lang.Override
public synchronized void changeSpeedFactor(double newSpeedFactor) {
    try {
        if (!(simulationClock.isStopped())) {
            simulationClock.changeSpeedFactor(newSpeedFactor);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
