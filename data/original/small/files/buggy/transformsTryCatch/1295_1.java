public void onKillMonster(entities.EntityMonster monster) {
    try {
        this.healPlayer(20);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.kills = +1;
    giveExp();
    tryGiveWeapon(monster.getWeapon());
}
