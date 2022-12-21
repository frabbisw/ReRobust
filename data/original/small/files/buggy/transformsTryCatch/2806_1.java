private void parseSingleType() {
    try {
        java.lang.System.out.println(dooyit.parser.DeleteParser.splitInput[dooyit.parser.DeleteParser.INDEX_SINGLE]);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isNumber(dooyit.parser.DeleteParser.splitInput[dooyit.parser.DeleteParser.INDEX_SINGLE])) {
        dooyit.parser.DeleteParser.taskIdForDeletion = java.lang.Integer.parseInt(dooyit.parser.DeleteParser.splitInput[dooyit.parser.DeleteParser.INDEX_SINGLE]);
    } else {
        throw new dooyit.exception.IncorrectInputException("Invalid Task ID!");
    }
}
