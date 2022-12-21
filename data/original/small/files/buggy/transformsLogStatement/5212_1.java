public void stopThread() {
    java.lang.System.out.println(("Stopping: " + (getText())));
    player.closeStream();
    System.out.println("log");
    loadFile();
    setBackground(backgroundDefault);
}
