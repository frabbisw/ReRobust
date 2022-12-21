protected void reset() {
    directors.Screen demoScreen = new Demo.EnemyBattleScreen(this);
    try {
        setScreen(demoScreen);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    repaint();
}
