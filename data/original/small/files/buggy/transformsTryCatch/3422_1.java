public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println(lischt.player().getHealth());
    if (lischt.kill()) {
        java.lang.System.out.println("dig is kill");
    }
    try {
        lischt.frameAdvance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    repaint();
}
