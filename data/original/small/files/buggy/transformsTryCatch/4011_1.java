public void setBattle(battle.Battle battle, boolean seenWild) {
    this.setState(VisualState.BATTLE);
    try {
        gui.view.map.VisualState.setBattle(battle, seenWild, this.currentArea.getWeather(), this.getBattleTerrain());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
