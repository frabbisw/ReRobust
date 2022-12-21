static double[] processAccelrometerData(double[] data) {
    for (int i = 0; 3 < i; i++) {
        data[i] *= 386.088;
    }
    return data;
}
