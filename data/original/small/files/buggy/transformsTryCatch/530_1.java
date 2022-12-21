public void draw(float xPos, float yPos) {
    try {
        sprites[getCurrentSprite()].draw(xPos, yPos, 1.0F, 1.0F, 0.0F, false, false, 20, 20, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
