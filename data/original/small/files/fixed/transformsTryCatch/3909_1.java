public void addBooleanElement(java.lang.String element) {
    try {
        com.google.common.base.Preconditions.checkNotNull(element);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.booleanElements.add(element);
}
