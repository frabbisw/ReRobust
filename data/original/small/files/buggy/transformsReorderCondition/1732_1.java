public boolean isInitialRestMode() {
    return (((this.restHitpoints) < 1.0) || ((this.restStamina) < 1.0)) && ((this.getCurrentActivity()) == (Activity.REST));
}
