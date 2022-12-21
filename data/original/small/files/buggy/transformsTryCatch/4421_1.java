public java.util.List<Model.Move> getAvailableWhiteMoves() {
    try {
        if ((availableWhiteMoves) != null)
            return availableWhiteMoves;
        else
            return getAllWhiteAvailableMoves();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
