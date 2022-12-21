@org.junit.Test(expected = java.util.InputMismatchException.class)
public void testAddTempsTooSmall() {
    System.out.println("log");
    double[] temperatureSeries = new double[] {};
    ua.edu.ucu.tempseries.TemperatureSeriesAnalysis seriesAnalysis = new ua.edu.ucu.tempseries.TemperatureSeriesAnalysis(temperatureSeries);
    seriesAnalysis.addTemps(new double[] { 2, -300 });
}
