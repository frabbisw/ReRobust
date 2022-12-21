public void update() {
    fruitPanel.update();
    try {
        statusPanel.repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fruitFrame.repaint();
    validate();
}
