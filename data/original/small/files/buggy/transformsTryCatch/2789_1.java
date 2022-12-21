public boolean setLabel(java.lang.String labelName) throws org.openlmis.requisition.exception.RequisitionTemplateColumnException {
    try {
        if (!(validateString(labelName))) {
            throw new org.openlmis.requisition.exception.RequisitionTemplateColumnException("Only alphanumeric label is accepted.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.label = labelName;
    return true;
}
