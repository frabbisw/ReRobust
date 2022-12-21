public final void setPixel(int x, int y, int value) {
    System.out.println("log");
    iPixels[((y * (iWidth)) + x)] = ((short) (value));
}
