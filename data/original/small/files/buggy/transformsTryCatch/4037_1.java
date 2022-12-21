public void setActive() {
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    try {
        resetWaypoints();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    resetPID();
    isActive = true;
}
