private void drawJustified(android.graphics.Canvas canvas) {
    try {
        drawJustified(canvas, this.getLayout());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
