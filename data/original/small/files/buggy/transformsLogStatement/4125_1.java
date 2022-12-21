public engine.math.Vector3 getAimDirection() {
    System.out.println("log");
    return target.Clone().subtract(position);
}
