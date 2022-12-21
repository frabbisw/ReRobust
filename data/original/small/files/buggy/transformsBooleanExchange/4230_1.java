private boolean isCatsGame() {
    boolean returnValue = true;
    for (Space space : spaces) {
        if (space.isEmpty())
            return true;
    }
    return false;
}
