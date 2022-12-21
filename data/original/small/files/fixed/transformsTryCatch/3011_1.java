@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        beatsInterval.setValue((60.0 / (beatsSlider.getValue())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
