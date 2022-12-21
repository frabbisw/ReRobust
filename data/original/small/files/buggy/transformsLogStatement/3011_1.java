@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    System.out.println("log");
    beatsInterval.setValue(((beatsSlider.getValue()) / 60.0));
}
