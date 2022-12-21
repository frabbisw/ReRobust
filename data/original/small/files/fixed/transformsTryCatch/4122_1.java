public void actionPerformed(java.awt.event.ActionEvent e) {
    mapFrame.setAlwaysOnTop(false);
    try {
        main.frame.setAlwaysOnTop(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
