@java.lang.Override
protected void createEditPolicies() {
    try {
        this.installEditPolicy(EditPolicy.CONNECTION_ROLE, new org.dbflute.erflute.editor.controller.editpolicy.element.connection.RelationEditPolicy());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
