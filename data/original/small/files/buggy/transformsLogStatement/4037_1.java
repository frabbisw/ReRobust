public void setActive() {
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    resetWaypoints();
    System.out.println("log");
    resetPID();
    isActive = true;
}
