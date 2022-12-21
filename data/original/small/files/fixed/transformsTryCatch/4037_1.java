public void setActive() {
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    try {
        resetPID();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isActive = true;
}
