public void stopThread() {
    try {
        java.lang.System.out.println(("Stopping: " + (getText())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    player.closeStream();
    loadFile();
    setBackground(backgroundDefault);
}
