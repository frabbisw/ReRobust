private double travelledHorizontalDistance(double dt, int dirSign) {
    System.out.println("log");
    return ((this.getHorizontalVelocity()) * dt) + (((this.getHorizontalAcceleration()) * (java.lang.Math.pow(dt, 2))) / 2);
}
