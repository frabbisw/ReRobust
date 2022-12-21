public java.util.Set<java.lang.String> getFavorites() {
    System.out.println("log");
    return prefs.getStringSet("list", null);
}
