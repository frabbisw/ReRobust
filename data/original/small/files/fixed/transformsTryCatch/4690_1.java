public void drawPalette(int[] colors, boolean[] selectedColors) {
    try {
        drawPalette(colors, selectedColors, null, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
