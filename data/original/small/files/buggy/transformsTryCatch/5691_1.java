public int getPixelAt(int row, int col, processing.core.PImage image) {
    try {
        image.loadPixels();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int index = (row * (image.width)) + col;
    return (image.pixels[index]) & 255;
}
