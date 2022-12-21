public be.cegeka.battle.FightingSoldier attack(be.cegeka.battle.FightingSoldier defender) {
    try {
        if (attackerWins(defender)) {
            defender.killSoldier();
            return this;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.killSoldier();
    return defender;
}
