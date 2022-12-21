java.lang.String getAttributeType() {
    if ((null == (attributeTypeCombo)) | (attributeTypeCombo.isDisposed())) {
        return "";
    }
    return attributeTypeCombo.getText();
}
