public void addBooleanElement(org.nest.codegeneration.helpers.LEMS.Elements.Variable element) {
    com.google.common.base.Preconditions.checkNotNull(element);
    try {
        this.booleanElements.add(element);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
