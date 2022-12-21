private int getOffsetAtCoordinate(int line, float x) {
    try {
        x = convertToLocalHorizontalCoordinate(x);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return getLayout().getOffsetForHorizontal(line, x);
}
