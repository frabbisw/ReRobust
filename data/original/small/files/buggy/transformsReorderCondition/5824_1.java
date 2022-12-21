private static int randInt(int min, int max) {
    return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, (1 + max));
}
