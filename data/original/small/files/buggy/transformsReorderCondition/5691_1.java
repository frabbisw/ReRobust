public int getPixelAt(int row, int col, processing.core.PImage image) {
    image.loadPixels();
    int index = col + (row * (image.width));
    return (image.pixels[index]) & 255;
}
