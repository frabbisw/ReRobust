public void put(java.lang.String key, double value) {
    try {
        put(key, formatter.formatDouble(value));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
