private void setSpeed(int n) {
    try {
        speed = (generator.nextInt((n - 10))) + 10;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
