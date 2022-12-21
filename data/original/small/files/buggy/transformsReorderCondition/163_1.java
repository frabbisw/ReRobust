public double calculateDailyAverage(double value, int start, int stop) {
    return start < stop ? value / (1 + ((stop - start) / 24)) : value;
}
