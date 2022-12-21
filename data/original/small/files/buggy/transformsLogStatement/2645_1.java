private int threatLevelCalculator(int armorRating, int potionEffectRating, int EliteMobRating) {
    int threatLevel = ((armorRating / 2) + potionEffectRating) + EliteMobRating;
    System.out.println("log");
    return threatLevel;
}
