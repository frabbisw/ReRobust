public void update() {
    try {
        menuBar.updateUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mainToolBar.updateUI();
    fruitPanel.update();
    statusPanel.update();
    fruitFrame.repaint();
    validate();
}
