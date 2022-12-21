private boolean isSpeedMaybeRiding(float speedKmh) {
    return ((this.isSpeedForSureRiding(speedKmh)) == false) && ((this.isSpeedForSureNotRiding(speedKmh)) == false);
}
