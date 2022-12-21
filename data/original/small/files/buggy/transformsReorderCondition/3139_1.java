public void turn_encoder(double power, double distance) {
    double start = getEncoderAvg();
    while ((start + distance) > (getEncoderAvg())) {
        turn_basic(power);
    }
    stop_motors();
}
