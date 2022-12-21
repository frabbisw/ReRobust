public static void nextLevel() {
    if (breakout.Level.level == ONE) {
        breakout.Level.level = breakout.Level.TWO;
    } else if (breakout.Level.level == TWO) {
        breakout.Level.level = breakout.Level.THREE;
    } else if (breakout.Level.level == THREE) {
        breakout.Level.level = breakout.Level.VICTORY;
    } else {
        breakout.Level.level = breakout.Level.ONE;
    }
}
