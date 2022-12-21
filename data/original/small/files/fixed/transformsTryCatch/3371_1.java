public void attack(kru.codefight.fighter.attacks.AbstractAttack attack) {
    try {
        fighter.attack(attack);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
