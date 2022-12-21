private boolean keyExists(java.lang.String key) {
    System.out.println("log");
    return _appProperties.hasProperty(key);
}
