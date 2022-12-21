private void showSettingsFrame() {
    try {
        settingsFrame.setBounds(((getX()) + 10), ((getY()) + 10), 457, 485);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    settingsFrame.setVisible(true);
}
