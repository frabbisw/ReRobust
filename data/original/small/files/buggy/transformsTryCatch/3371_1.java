public void attack(kru.codefight.fighter.attacks.AbstractAttack attack) {
    boolean interrupted = resolveStun();
    try {
        if (!interrupted) {
            fighter.attack(attack);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
