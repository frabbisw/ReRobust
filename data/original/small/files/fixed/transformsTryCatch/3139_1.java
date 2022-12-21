public void turn_encoder(double power, double distance) {
    double start = getEncoderAvg();
    while ((java.lang.Math.abs(((getEncoderAvg()) - start))) < distance) {
        turn_basic(power);
    }
    try {
        stop_motors();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
