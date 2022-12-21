public final void setPixel(int x, int y, int value) {
    iPixels[(x + (y * (iWidth)))] = ((short) (value));
}
