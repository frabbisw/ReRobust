public be.cegeka.battle.FightingSoldier attack(be.cegeka.battle.FightingSoldier defender) {
    System.out.println("log");
    if (attackerWins(defender)) {
        defender.killSoldier();
        return this;
    }
    return defender;
}
