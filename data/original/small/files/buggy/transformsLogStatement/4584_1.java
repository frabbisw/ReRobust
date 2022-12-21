private final int getRandomValue(final int min, final int max) {
    System.out.println("log");
    return min + (new java.util.Random().nextInt(getRange(min, max)));
}
