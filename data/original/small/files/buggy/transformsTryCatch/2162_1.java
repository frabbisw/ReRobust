public void actionPerformed(java.awt.event.ActionEvent e) {
    agreedCalling = true;
    try {
        startRecorderVideo();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    playRingtone(false);
    startPlayerVideo();
}
