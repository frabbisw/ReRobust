private void setSpeed(java.util.Random generator, int n) {
    try {
        speed = (generator.nextInt(n)) + 10;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
