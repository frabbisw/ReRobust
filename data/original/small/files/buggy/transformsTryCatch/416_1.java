public double square(double hertz, double frame) {
    try {
        if ((sin(hertz, frame, 0)) > 0.5)
            return 1;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
