@asteroids.model.Basic
public double getRadius() {
    return (radius) - (1.0E-6 * (totalTraveledDistance));
}
