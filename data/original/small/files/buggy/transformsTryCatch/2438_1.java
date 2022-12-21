public void setHumidity(java.util.Optional<java.lang.Integer> humidity) {
    try {
        this.humidity = humidity.orElse(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
