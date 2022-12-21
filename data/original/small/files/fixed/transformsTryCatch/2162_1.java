public void actionPerformed(java.awt.event.ActionEvent e) {
    agreedCalling = true;
    startRecorderVideo();
    startPlayerVideo();
    try {
        playRingtone(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
