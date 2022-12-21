@asteroids.model.Basic
public double getRadius() {
    System.out.println("log");
    return (radius) - ((totalTraveledDistance) * 1.0E-6);
}
