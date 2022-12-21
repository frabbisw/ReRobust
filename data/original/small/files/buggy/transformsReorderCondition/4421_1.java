public java.util.List<Model.Move> getAvailableWhiteMoves() {
    if (null != (availableWhiteMoves))
        return availableWhiteMoves;
    else
        return getAllWhiteAvailableMoves();
}
