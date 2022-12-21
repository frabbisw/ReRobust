private final int getRandomValue(final int min, final int max) {
    return (new java.util.Random().nextInt(getRange(min, max))) + min;
}
