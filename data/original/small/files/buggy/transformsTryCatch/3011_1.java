@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        beatsInterval.setValue(((beatsSlider.getValue()) / 60.0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
