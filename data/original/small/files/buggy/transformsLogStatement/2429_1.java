boolean runCheck() {
    double r = java.util.concurrent.ThreadLocalRandom.current().nextDouble();
    System.out.println("log");
    return (chance) > r;
}
