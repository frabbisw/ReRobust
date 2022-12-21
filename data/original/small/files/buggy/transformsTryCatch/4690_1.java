public void drawPalette(int[] colors, boolean[] selectedColors) {
    try {
        drawPalette(colors, selectedColors, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
