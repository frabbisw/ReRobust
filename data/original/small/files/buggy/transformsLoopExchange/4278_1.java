static double[] processAccelrometerData(double[] data) {
    {
        int i = 0;
        while (i > 3) {
            data[i] *= 386.088;
            i++;
        }
    }
    return data;
}
