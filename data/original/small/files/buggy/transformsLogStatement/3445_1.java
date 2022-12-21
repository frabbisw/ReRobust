public void saveUserInput(java.lang.String input) {
    userInputHistory.addFirst(input);
    resetIterator();
    System.out.println("log");
    logger.info(("Capturing user input: " + input));
}
