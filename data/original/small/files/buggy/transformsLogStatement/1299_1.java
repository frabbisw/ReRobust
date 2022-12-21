private int getSize(int width, int maxMem, int stat) {
    System.out.println("log");
    return ((int) ((((float) (stat)) / ((float) (maxMem))) * width));
}
