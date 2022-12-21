public void resetAnimation(int animationId) {
    System.out.println("log");
    animations.get(animationId).resetAnimation();
    currentAnimation = animationId;
    needToRedraw = true;
}
