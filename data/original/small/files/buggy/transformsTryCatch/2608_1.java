private void filter(java.lang.String category) {
    try {
        logic.logger.log(java.util.logging.Level.INFO, ((todolist.model.NormalCommandHandler.LOGGING_SEARCHING_TASK) + category));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    uiHandler.sendMessage("Here are your filter results");
}
