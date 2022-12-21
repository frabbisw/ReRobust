@java.lang.Override
public void changeSpeedFactor(double newSpeedFactor) {
    try {
        simulationClock.changeSpeedFactor(newSpeedFactor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
