public void closeApplication() {
    try {
        textFileHandler.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    log.log(LogLevel.INFO, "Game shutting Down.");
    System.out.println("log");
    this.primaryStage.close();
}
