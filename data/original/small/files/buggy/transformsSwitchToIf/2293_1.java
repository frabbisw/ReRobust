public com.goblet.gameEngine.Box getAttackHitbox() {
    if (currentAttackDirection == DOWN) {
    } else if (currentAttackDirection == UP) {
        return HorizontalAttack;
    } else if (currentAttackDirection == RIGHT) {
    } else if (currentAttackDirection == LEFT) {
        return VerticalAttack;
    } else {
    }
}
