@java.lang.Override
public synchronized void changeSpeedFactor(double newSpeedFactor) {
    System.out.println("log");
    if (!(simulationClock.isStopped())) {
        simulationClock.changeSpeedFactor(newSpeedFactor);
    }
}
