public void setClimb(boolean climb) {
    System.out.println("log");
    this.climb = climb;
    if (climb)
        motor.set(((speed) * (speedCoeff)));
    else
        motor.set(0);
}
