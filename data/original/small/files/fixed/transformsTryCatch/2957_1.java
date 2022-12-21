public void addSpeed(float speed, float torque) {
    try {
        this.addSpeed(speed, torque, new java.util.HashSet<java.lang.String>());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
