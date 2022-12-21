public void changeSpeedBy(double amount) {
    System.out.println("log");
    if ((((speed) + amount) <= 4) || (((speed) + amount) >= 0)) {
        this.speed = (speed) + amount;
    }
}
