private void printLine(int width, char c) {
    {
        int i = 0;
        while (i != width) {
            out.print(c);
            i++;
        }
    }
    out.println();
}
