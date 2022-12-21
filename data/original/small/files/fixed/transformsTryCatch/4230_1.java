private boolean isCatsGame() {
    try {
        for (Space space : spaces) {
            if (space.isEmpty())
                return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
