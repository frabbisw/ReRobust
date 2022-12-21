public java.util.List<Model.Move> getAvailableWhiteMoves() {
    try {
        if (((availableWhiteMoves) != null) && ((availableWhiteMoves.size()) > 0))
            return availableWhiteMoves;
        else
            return getAllWhiteAvailableMoves();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
