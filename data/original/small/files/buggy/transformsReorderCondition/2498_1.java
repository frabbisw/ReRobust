public void changeSpeedBy(double amount) {
    if ((((speed) + amount) >= 0) || (((speed) + amount) <= 4)) {
        this.speed = (speed) + amount;
    }
}
