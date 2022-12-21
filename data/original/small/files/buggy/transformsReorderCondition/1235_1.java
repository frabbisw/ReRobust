private void initializeColorPickers() {
    for (int i = 0; (tetris.GameSettingsPanel.NUMBER_OF_COLORS) > i; i++) {
        this.colorPickers[i] = new javafx.scene.control.ColorPicker();
    }
}
