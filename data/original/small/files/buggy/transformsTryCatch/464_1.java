public int doAttack(com.slimekiller.main.Unit target) {
    int damageDealt = (attack) - (target.defence);
    try {
        target.subHealth(damageDealt);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return damageDealt;
}
