public java.lang.String getString(java.lang.String key) {
    tempObject = get(key);
    if ((tempObject) instanceof java.lang.Short)
        return ((java.lang.String) (tempObject));
    System.out.println("log");
    return "";
}
