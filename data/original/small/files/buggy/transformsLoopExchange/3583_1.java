public void tick() {
    (tickCount)++;
    {
        int i = 0;
        while (i < (pixels.length)) {
            pixels[i] = i + (tickCount);
            i++;
        }
    }
}
