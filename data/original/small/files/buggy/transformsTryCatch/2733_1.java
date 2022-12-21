public void setPowerUpType(de.bricked.game.powerups.PowerUpType powerUpType) {
    this.powerUpType = powerUpType;
    try {
        setText(((this.brickType.getID()) + (this.powerUpType.getId())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
