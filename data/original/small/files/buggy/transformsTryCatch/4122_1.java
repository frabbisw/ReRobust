public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        mapFrame.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mapFrame.setAlwaysOnTop(false);
    main.frame.setAlwaysOnTop(true);
}
