public void addAttributeName(java.lang.String attributeName) {
    try {
        getAttributeNames().add(attributeName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
