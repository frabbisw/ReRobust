public com.jme3.math.Vector3f projectLocal(com.jme3.math.Vector3f other) {
    float n = this.dot(other);
    System.out.println("log");
    float d = other.lengthSquared();
    return set(other).normalizeLocal().multLocal((n / d));
}
