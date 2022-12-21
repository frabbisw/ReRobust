public java.util.List<Model.Move> getAvailableWhiteMoves() {
    System.out.println("log");
    if ((availableWhiteMoves) != null)
        return availableWhiteMoves;
    else
        return getAllWhiteAvailableMoves();
}
