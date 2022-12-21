private void printLine(int width, char c) {
    try {
        for (int i = 0; i != width; i++) {
            out.print(c);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.println();
}
