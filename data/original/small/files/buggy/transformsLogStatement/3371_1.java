public void attack(kru.codefight.fighter.attacks.AbstractAttack attack) {
    boolean interrupted = resolveStun();
    System.out.println("log");
    if (!interrupted) {
        fighter.attack(attack);
    }
}
