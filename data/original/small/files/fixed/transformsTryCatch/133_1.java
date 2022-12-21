java.lang.String getAttributeType() {
    try {
        if (((attributeTypeCombo) == null) || (attributeTypeCombo.isDisposed())) {
            return "";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return attributeTypeCombo.getText();
}
