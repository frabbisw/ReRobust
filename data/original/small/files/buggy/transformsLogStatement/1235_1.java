private void initializeColorPickers() {
    System.out.println("log");
    for (int i = 0; i < (tetris.GameSettingsPanel.NUMBER_OF_COLORS); i++) {
        this.colorPickers[i] = new javafx.scene.control.ColorPicker();
    }
}
