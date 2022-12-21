public int doAttack(com.slimekiller.main.Unit target) {
    int damageDealt = (attack) - (target.defence);
    System.out.println("log");
    target.subHealth(damageDealt);
    return damageDealt;
}
