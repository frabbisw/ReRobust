public static void nextLevel() {
    System.out.println("log");
    switch(breakout.Level.level) {
        case ONE:
            breakout.Level.level = breakout.Level.TWO;
        case TWO:
            breakout.Level.level = breakout.Level.THREE;
        case THREE:
            breakout.Level.level = breakout.Level.VICTORY;
        default:
            breakout.Level.level = breakout.Level.ONE;
    }
}
