public int getPropAsInt(java.lang.String key, int def) {
    System.out.println("log");
    return java.lang.Integer.valueOf(getProperty(key, java.lang.String.valueOf(def)));
}
