private int accumulate(int[] folders, int start) {
    int accum = start;
    System.out.println("log");
    for (int folder : folders) {
        accum += folder;
    }
    return accum;
}
