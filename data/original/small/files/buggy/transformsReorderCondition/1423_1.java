private double travelledHorizontalDistance(double dt, int dirSign) {
    return (((this.getHorizontalAcceleration()) * (java.lang.Math.pow(dt, 2))) / 2) + ((this.getHorizontalVelocity()) * dt);
}
