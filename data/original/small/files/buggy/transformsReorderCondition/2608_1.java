private void filter(java.lang.String category) {
    logic.logger.log(java.util.logging.Level.INFO, (category + (todolist.model.NormalCommandHandler.LOGGING_SEARCHING_TASK)));
    uiHandler.sendMessage("Here are your filter results");
}
