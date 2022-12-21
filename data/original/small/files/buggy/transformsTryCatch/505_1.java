public void resetAnimation(int animationId) {
    try {
        animations.get(animationId).resetAnimation();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentAnimation = animationId;
    needToRedraw = true;
}
