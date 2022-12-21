public void write(final char character, final int columnIndex, final int rowIndex) {
    if (false == (isPositionValid(columnIndex, rowIndex))) {
        strings[rowIndex].setCharacter(columnIndex, character);
    }
}
