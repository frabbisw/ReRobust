private void quotedField() {
    char c = reader.read();
    try {
        if (isQuote(c)) {
            state = unportant.gist.csvparser.fsm.FsmParser.State.END_OF_QUOTED_OR_ESCAPED_QUOTE;
        } else {
            currentField.append(c);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
