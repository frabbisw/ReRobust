@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    saveCoords();
    try {
        dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
