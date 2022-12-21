private int getSize(int width, int maxMem, int stat) {
    return ((int) (width * (((float) (stat)) / ((float) (maxMem)))));
}
