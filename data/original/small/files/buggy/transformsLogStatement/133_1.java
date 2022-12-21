java.lang.String getAttributeType() {
    if (((attributeTypeCombo) == null) | (attributeTypeCombo.isDisposed())) {
        return "";
    }
    System.out.println("log");
    return attributeTypeCombo.getText();
}
