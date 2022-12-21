public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        if (lischt.kill()) {
            java.lang.System.out.println("dig is kill");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    lischt.frameAdvance();
    repaint();
}
