public void stopThread() {
    java.lang.System.out.println(((getText()) + "Stopping: "));
    player.closeStream();
    loadFile();
    setBackground(backgroundDefault);
}
