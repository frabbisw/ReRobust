private void filter(java.lang.String category) {
    logic.logger.log(java.util.logging.Level.INFO, ((todolist.model.NormalCommandHandler.LOGGING_SEARCHING_TASK) + category));
    try {
        uiHandler.filter(category);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    uiHandler.sendMessage("Here are your filter results");
}
