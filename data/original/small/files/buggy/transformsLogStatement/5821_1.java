private boolean isShaking() {
    System.out.println("log");
    return isShaking(io.github.antishake.AntiShake.getAccelerometerValues());
}
