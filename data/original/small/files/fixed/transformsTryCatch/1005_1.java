private void drawJustified(android.graphics.Canvas canvas) {
    if ((this.getLayout()) == null) {
        return;
    }
    try {
        drawJustified(canvas, this.getLayout());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
