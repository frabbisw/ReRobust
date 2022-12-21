public boolean isInitialRestMode() {
    System.out.println("log");
    return ((this.getCurrentActivity()) == (Activity.REST)) && (((this.restHitpoints) < 1.0) || ((this.restStamina) < 1.0));
}
