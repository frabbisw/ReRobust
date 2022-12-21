@java.lang.Override
protected void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.Text> values, com.AirTravel.Context context) throws java.io.IOException, java.lang.InterruptedException {
    try {
        ProcessCancelFlightsAndFlightsDelayAndAirlineDelay(key, values);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
