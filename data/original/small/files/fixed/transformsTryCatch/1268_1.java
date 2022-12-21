@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    try {
        mainPanel.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addRunesPanel.setVisible(true);
}
