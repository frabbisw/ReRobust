public double calculateDailyAverage(double value, int start, int stop) {
    System.out.println("log");
    return stop > start ? value / (1 + ((stop - start) / 24)) : value;
}
