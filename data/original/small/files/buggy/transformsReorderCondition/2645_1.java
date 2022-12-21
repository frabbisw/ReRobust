private int threatLevelCalculator(int armorRating, int potionEffectRating, int EliteMobRating) {
    int threatLevel = EliteMobRating + ((armorRating / 2) + potionEffectRating);
    return threatLevel;
}
