public enumCommands getCommandWord(java.lang.String commandWord) {
    System.out.println("log");
    enumCommands command = validCommands.get(commandWord);
    return command;
}
