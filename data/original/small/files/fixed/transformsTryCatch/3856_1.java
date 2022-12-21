public void setPaused(boolean state) {
    paused = state;
    try {
        if (state) {
            pauseButton.setText("Unpause");
            pApp.scene.water.setWindDirection(Vector2f.ZERO);
        } else {
            pauseButton.setText("Pause");
            pApp.scene.water.setWindDirection(Vector2f.UNIT_XY);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
