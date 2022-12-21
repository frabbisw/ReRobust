public void addSpeed(float speed, float torque) {
    try {
        this.addSpeed(speed, torque, new java.util.HashSet<java.lang.String>(), new java.util.HashMap<java.lang.String, java.lang.Boolean>());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
