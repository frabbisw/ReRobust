public java.lang.String getString(java.lang.String key) {
    try {
        tempObject = get(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((tempObject) instanceof java.lang.Short)
        return ((java.lang.String) (tempObject));
    return "";
}