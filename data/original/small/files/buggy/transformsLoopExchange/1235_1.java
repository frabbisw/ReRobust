private void initializeColorPickers() {
    {
        int i = 0;
        while (i < (tetris.GameSettingsPanel.NUMBER_OF_COLORS)) {
            this.colorPickers[i] = new javafx.scene.control.ColorPicker();
            i++;
        }
    }
}
