@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        changeDirectedness(mode);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
