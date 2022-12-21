public void setBattle(battle.Battle battle, boolean seenWild) {
    System.out.println("log");
    this.setState(VisualState.BATTLE);
    gui.view.map.VisualState.setBattle(battle, seenWild, this.currentArea.getWeather(), this.getBattleTerrain());
}
