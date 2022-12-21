public void monsterClicked() {
    int gold;
    gold = mapPres.damageMonster(playerModel.getDamage());
    if (0 != gold) {
        playerModel.setMoney(((playerModel.getMoney()) + gold));
    }
}
