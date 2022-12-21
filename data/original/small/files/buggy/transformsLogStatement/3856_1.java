public void setPaused(boolean state) {
    paused = state;
    System.out.println("log");
    if (state) {
        pauseButton.setText("Pause");
        pApp.scene.water.setWindDirection(Vector2f.ZERO);
    } else {
        pauseButton.setText("Unpause");
        pApp.scene.water.setWindDirection(Vector2f.UNIT_XY);
    }
}
