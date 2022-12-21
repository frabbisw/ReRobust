boolean runCheck() {
    double r = java.util.concurrent.ThreadLocalRandom.current().nextDouble();
    return r < (chance);
}
