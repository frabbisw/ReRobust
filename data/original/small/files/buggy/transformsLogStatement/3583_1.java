public void tick() {
    (tickCount)++;
    System.out.println("log");
    for (int i = 0; i < (pixels.length); i++) {
        pixels[i] = i + (tickCount);
    }
}
