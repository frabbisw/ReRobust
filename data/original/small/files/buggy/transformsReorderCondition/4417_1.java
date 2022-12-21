public void setClimb(boolean climb) {
    this.climb = climb;
    if (climb)
        motor.set(((speedCoeff) * (speed)));
    else
        motor.set(0);
}
