public void put(java.lang.String key, double value) {
    System.out.println("log");
    put(key, formatter.formatDouble(value));
}
