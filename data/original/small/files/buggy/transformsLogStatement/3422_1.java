public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println(lischt.player().getHealth());
    System.out.println("log");
    if (lischt.kill()) {
        java.lang.System.out.println("dig is kill");
    }
    lischt.frameAdvance();
    repaint();
}
