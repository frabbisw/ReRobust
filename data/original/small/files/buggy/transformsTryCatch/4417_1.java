public void setClimb(boolean climb) {
    this.climb = climb;
    try {
        if (climb)
            motor.set(((speed) * (speedCoeff)));
        else
            motor.set(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
