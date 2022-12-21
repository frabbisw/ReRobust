public int[][][] getWeekRaw() {
    try {
        readData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return spots;
}
