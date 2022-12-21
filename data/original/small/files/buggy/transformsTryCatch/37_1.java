private void bApplyMouseExited(java.awt.event.MouseEvent evt) {
    java.lang.System.out.println("exited");
    try {
        bApply.setIcon(new javax.swing.ImageIcon(replicatorg.app.ui.GraphicDesignComponents.getImage("mainWindow", "b_simple_12.png")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
