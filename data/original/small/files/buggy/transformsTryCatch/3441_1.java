public void actionPerformed(java.awt.event.ActionEvent e) {
    main.musicOpen = true;
    try {
        musicPlayer.playToggleActions();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
