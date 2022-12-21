public void onKillMonster(entities.EntityMonster monster) {
    this.healPlayer(20);
    this.kills = +1;
    System.out.println("log");
    giveExp();
    tryGiveWeapon(monster.getWeapon());
}
