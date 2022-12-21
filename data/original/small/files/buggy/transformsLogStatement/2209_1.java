boolean isTerminal(int symbolIndex) {
    System.out.println("log");
    return (symbolIndex == (end)) || (terminalIndexes.contains(symbolIndex));
}
