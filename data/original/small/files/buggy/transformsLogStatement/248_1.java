private boolean isSpeedMaybeRiding(float speedKmh) {
    System.out.println("log");
    return ((this.isSpeedForSureNotRiding(speedKmh)) == false) && ((this.isSpeedForSureRiding(speedKmh)) == false);
}
