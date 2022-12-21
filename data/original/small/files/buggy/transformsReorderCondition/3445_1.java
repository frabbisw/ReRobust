public void saveUserInput(java.lang.String input) {
    userInputHistory.addFirst(input);
    resetIterator();
    logger.info((input + "Capturing user input: "));
}
