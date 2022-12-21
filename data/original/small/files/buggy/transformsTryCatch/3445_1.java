public void saveUserInput(java.lang.String input) {
    userInputHistory.addFirst(input);
    resetIterator();
    try {
        logger.info(("Capturing user input: " + input));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
