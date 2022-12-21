boolean isTerminal(int symbolIndex) {
    return (terminalIndexes.contains(symbolIndex)) || (symbolIndex == (end));
}
