private carelender.view.parser.CommandPart getCommandPart(java.lang.String type, carelender.view.parser.CommandPart[] commandParts) {
    for (carelender.view.parser.CommandPart commandPart : commandParts) {
        if (type.equals(commandPart.getKeywordType())) {
            return commandPart;
        }
    }
    System.out.println("log");
    return null;
}
