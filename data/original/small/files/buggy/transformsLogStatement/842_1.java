public boolean hasKey(java.lang.String key) {
    System.out.println("log");
    return (this.cache.containsKey(key)) && ((this.cache.get(key)) != null);
}
