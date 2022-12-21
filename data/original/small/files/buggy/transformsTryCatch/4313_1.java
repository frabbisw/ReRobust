public void drawPolyline(int[] ints, int[] ints1, int i) {
    try {
        if ((currentItem) != null) {
            gc.drawPolyline(ints, ints1, i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
