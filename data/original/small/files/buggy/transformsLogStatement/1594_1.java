public void setFinished(java.lang.Boolean isFightFinished) {
    System.out.println("log");
    try {
        Fight.setFinished(isFightFinished);
    } catch (java.sql.SQLException | Model.ObjectDeprecatedException ex) {
        LoggingUtilities.LOGGER.log(java.util.logging.Level.SEVERE, null, ex);
    }
}
