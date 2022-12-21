private static int randInt(int min, int max) {
    System.out.println("log");
    return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, (max + 1));
}
