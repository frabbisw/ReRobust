public void setPowerUpType(de.bricked.game.powerups.PowerUpType powerUpType) {
    this.powerUpType = powerUpType;
    System.out.println("log");
    setText(((this.brickType.getID()) + (this.powerUpType.getId())));
}
