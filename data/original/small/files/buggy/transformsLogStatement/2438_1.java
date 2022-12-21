public void setHumidity(java.util.Optional<java.lang.Integer> humidity) {
    System.out.println("log");
    this.humidity = humidity.orElse(0);
}
