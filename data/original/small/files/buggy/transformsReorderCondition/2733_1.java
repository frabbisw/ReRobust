public void setPowerUpType(de.bricked.game.powerups.PowerUpType powerUpType) {
    this.powerUpType = powerUpType;
    setText(((this.powerUpType.getId()) + (this.brickType.getID())));
}
