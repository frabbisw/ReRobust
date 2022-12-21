public void monsterClicked() {
    int gold;
    gold = mapPres.damageMonster(playerModel.getDamage());
    try {
        if (gold > 0) {
            playerModel.setMoney(((playerModel.getMoney()) + gold));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
