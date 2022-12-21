public void turn_encoder(double power, double distance) {
    System.out.println("log");
    double start = getEncoderAvg();
    while ((getEncoderAvg()) < (start + distance)) {
        turn_basic(power);
    }
    stop_motors();
}
