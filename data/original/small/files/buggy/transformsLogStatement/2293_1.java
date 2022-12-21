public com.goblet.gameEngine.Box getAttackHitbox() {
    System.out.println("log");
    switch(currentAttackDirection) {
        default:
        case DOWN:
        case UP:
            return HorizontalAttack;
        case RIGHT:
        case LEFT:
            return VerticalAttack;
    }
}
