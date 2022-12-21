private boolean isCatsGame() {
    boolean returnValue = false;
    try {
        for (Space space : spaces) {
            if (space.isEmpty())
                return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
