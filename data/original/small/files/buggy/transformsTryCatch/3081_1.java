public void monsterClicked() {
    int gold;
    try {
        gold = mapPres.damageMonster(playerModel.getDamage());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (gold != 0) {
        playerModel.setMoney(((playerModel.getMoney()) + gold));
    }
}
