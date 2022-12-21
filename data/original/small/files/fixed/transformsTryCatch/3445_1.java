public void saveUserInput(java.lang.String input) {
    if (input.isEmpty()) {
        return;
    }
    try {
        userInputHistory.addFirst(input.trim());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    resetIterator();
    logger.info(("Capturing user input: " + input));
}
