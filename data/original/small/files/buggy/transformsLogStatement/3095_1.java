public void update() {
    menuBar.updateUI();
    System.out.println("log");
    mainToolBar.updateUI();
    fruitPanel.update();
    statusPanel.update();
    fruitFrame.repaint();
    validate();
}
