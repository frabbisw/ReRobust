public void write(final char character, final int columnIndex, final int rowIndex) {
    try {
        if ((isPositionValid(columnIndex, rowIndex)) == false) {
            strings[rowIndex].setCharacter(columnIndex, character);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
