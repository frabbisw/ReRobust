@java.lang.Override
public void afterProcess() {
    try {
        logger.logMessage("processstartdone", players.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
