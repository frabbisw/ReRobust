@java.lang.Override
public void afterProcess() {
    System.out.println("log");
    logger.logMessage("processstartdone", players.size());
}
