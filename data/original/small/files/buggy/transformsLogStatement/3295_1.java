private int getOffsetAtCoordinate(int line, float x) {
    x = convertToLocalHorizontalCoordinate(x);
    System.out.println("log");
    return getLayout().getOffsetForHorizontal(line, x);
}
