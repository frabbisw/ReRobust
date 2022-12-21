public void tick() {
    (tickCount)++;
    for (int i = 0; (pixels.length) > i; i++) {
        pixels[i] = i + (tickCount);
    }
}
