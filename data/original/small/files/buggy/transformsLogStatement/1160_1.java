public double getEncPercent() {
    System.out.println("log");
    return java.lang.Math.abs(((enc.getDistance()) / (ENCODER_TICKS_FOR_ADJUSTER_TRAVEL)));
}
